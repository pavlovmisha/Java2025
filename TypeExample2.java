public class TypeExample2 {
    public static void main(String[] args) {
        double pi = 3.14159;
        int intPi = (int) pi; // явное приведение
        System.out.println("double -> int: " + intPi);
        
        int largeInt = 130;
        byte smallByte = (byte) largeInt; // сужающее преобразование
        System.out.println("int -> byte: " + smallByte);
    }
}