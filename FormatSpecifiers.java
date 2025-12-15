public class FormatSpecifiers {
    public static void main(String[] args) {
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 123;
        double doubleValue = 45.6789;
        String strValue = "Пример строки";

        System.out.printf("Логическое значение (%%b): %b%n", boolValue);
        System.out.printf("Символьное представление (%%c): %c%n", charValue);
        System.out.printf("Десятичное целое (%%d): %d%n", intValue);
        System.out.printf("Значение с плавающей точкой (%%f): %.2f%n", doubleValue);
        System.out.printf("Строковое представление (%%s): %s%n", strValue);
    }
}