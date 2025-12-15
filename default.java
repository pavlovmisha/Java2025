interface MyInterface {
    default void defaultMethod() {
        System.out.println("Это неабстрактный default-метод интерфейса");
    }

    static void staticMethod() {
        System.out.println("Это статический метод интерфейса");
    }
}

class MyClass implements MyInterface {
    // Можно оставить без изменений или переопределить default-метод
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod(); // вызов default-метода через объект

        MyInterface.staticMethod(); // вызов статического метода интерфейса
    }
}