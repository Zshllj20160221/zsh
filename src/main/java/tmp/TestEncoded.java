package tmp;

public class TestEncoded {
    public static void encode() {
        String name = "I am 君山";
//        toHex(name.toCharArray());
        try {
            byte[] iso8859 = name.getBytes("ISO-8859-1");
//          toHex(iso8859);
            int j = 0144;
        } catch (Exception e) {

        }
    }


}
