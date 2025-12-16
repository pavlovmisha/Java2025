public class Exceptions2 {
    public static void main(String[] args) {
        // Первое исключение: деление на ноль, перехвачено и обработано
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        // Второе исключение: попытка вызова метода у null, не перехвачено
        String str = null;
        System.out.println(str.length()); // вызовет NullPointerException и завершит программу
    }
}