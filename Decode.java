public class Decode {
    public static void main(String[] args) {
        Integer dec1 = Integer.decode("123");
        Integer dec2 = Integer.decode("0x1A");
        Integer dec3 = Integer.decode("077");

        System.out.println("Integer.decode(\"123\"): " + dec1);
        System.out.println("Integer.decode(\"0x1A\"): " + dec2);
        System.out.println("Integer.decode(\"077\"): " + dec3);

        Long longVal = Long.decode("0xFF");
        System.out.println("Long.decode(\"0xFF\"): " + longVal);
    }
}