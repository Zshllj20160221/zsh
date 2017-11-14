代理：静态和动态 分别对应编译时和运行时


proxyDemo  静态代理 动态代理

reflect 反射




proxy:
http://blog.csdn.net/mantantan/article/details/51873755



java jni
参考资料：
http://blog.csdn.net/u010853261/article/details/53470514
cd /Users/zsh/IdeaProjects/zsh/target/classe
javah HelloWorld
gcc -dynamiclib -I /Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home/include/ HelloWorldImpl.c -o libhello.jnilib
java HelloWorld



gcc -dynamiclib -I /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/include/ HelloWorldImpl.c -o libhello.jnilib
