package im;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by zsh on 2017/11/11.
 *
 */
public class NIOClient {
    //通道管理器
    private Selector selector;

    /**
     * 获得一个Socket通道，并对该通道做一些初始化的工作
     *
     * @param ip   连接的服务器的ip
     * @param port 连接的服务器的端口号
     * @throws IOException
     */
    public void initClient(String ip, int port) throws IOException {
        // 获得一个Socket通道
        SocketChannel channel = SocketChannel.open();
        // 设置通道为非阻塞
        channel.configureBlocking(false);
        // 获得一个通道管理器
        this.selector = Selector.open();

        // 客户端连接服务器,其实方法执行并没有实现连接，需要在listen（）方法中调
        //用channel.finishConnect();才能完成连接
        channel.connect(new InetSocketAddress(ip, port));
        //将通道管理器和该通道绑定，并为该通道注册SelectionKey.OP_CONNECT事件。
        channel.register(selector, SelectionKey.OP_CONNECT);
    }

    /**
     * 采用轮询的方式监听selector上是否有需要处理的事件，如果有，则进行处理
     *
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public void listen() throws IOException {
        // 轮询访问selector
        while (true) {
            selector.select();
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            // 获得selector中选中的项的迭代器
            Iterator ite = this.selector.selectedKeys().iterator();
            while (ite.hasNext()) {
                SelectionKey key = (SelectionKey) ite.next();
                // 删除已选的key,以防重复处理
                ite.remove();
                // 连接事件发生
                if (key.isConnectable()) {
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    SocketChannel channel = (SocketChannel) key
                            .channel();
                    // 如果正在连接，则完成连接
                    if (channel.isConnectionPending()) {
                        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                        channel.finishConnect();

                    }
                    // 设置成非阻塞
                    channel.configureBlocking(false);

                    //在这里可以给服务端发送信息哦
                    channel.write(ByteBuffer.wrap(new String("Hello Server!").getBytes()));
                    //在和服务端连接成功之后，为了可以接收到服务端的信息，需要给通道设置读的权限。
                    channel.register(this.selector, SelectionKey.OP_READ);

                    // 获得了可读的事件
                } else if (key.isReadable()) {
                    System.out.println("************************************************");
                    read(key);
                }

            }

        }
    }

    /**
     * 处理读取服务端发来的信息 的事件
     *
     * @param key
     * @throws IOException
     */
    public void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer butyBuffer = ByteBuffer.allocate(100);
        channel.read(butyBuffer);
        byte[] data = butyBuffer.array();
        String msg = new String(data).trim();
        System.out.println("客户端收到的信息：" + msg);
        // 以下代码向服务端发送信息 一直发送
//        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
//        channel.write(outBuffer);// 将消息再次发送给服务端

    }


    /**
     * 启动客户端测试
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        NIOClient client = new NIOClient();
        client.initClient("localhost", 8000);
        client.listen();
    }
}
