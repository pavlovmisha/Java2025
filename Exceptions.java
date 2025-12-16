public class Exceptions {
    public static void main(String[] args) {
        // 1. ArithmeticException (деление на ноль)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Обработка ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException (выход за границы массива)
        try {
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. IllegalArgumentException (невалидный аргумент метода)
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("Обработка IllegalArgumentException или InterruptedException: " + e.getMessage());
        }

        // 4. ClassCastException (неправильное приведение типа)
        try {
            Object obj = "строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Обработка ClassCastException: " + e.getMessage());
        }

        // 5. NullPointerException (работа с null)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Обработка NullPointerException: " + e.getMessage());
        }
    }
}