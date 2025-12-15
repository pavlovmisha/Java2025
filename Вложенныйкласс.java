interface MyInterface {
    public static class NestedClass {
        public void showMessage() {
            System.out.println("Это метод вложенного класса внутри интерфейса");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface.NestedClass obj = new MyInterface.NestedClass();

        obj.showMessage();
    }
}