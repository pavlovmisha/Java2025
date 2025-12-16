class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class Exceptions3 {
    public static void main(String[] args) {
        
        try {
            
            int[] arr = {1, 2, 3};
            int x = arr[5];

            int num = Integer.parseInt("abc");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Общий обработчик для NumberFormatException и ArrayIndexOutOfBoundsException: " + e);
        }

        try {
            
            throw new Ex3("Это исключение Ex3");
        } catch (Ex1 e) {
            System.out.println("Обработка исключения типа Ex1: " + e.getMessage());
        }
    }
}