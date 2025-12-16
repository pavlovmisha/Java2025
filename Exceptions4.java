class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Это мое собственное исключение!");
        } catch (MyCustomException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}