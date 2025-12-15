interface InterfaceA {
    default void show() {
        System.out.println("Метод show из InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Метод show из InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        // Обязательно переопределяем метод, иначе компилятор выдаст ошибку
        System.out.println("Переопределённый метод show в MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show(); 
    }
}