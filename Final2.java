final class A {
    int a;
    public void display() {
        System.out.println("Класс A");
    }
}

// Попытка создать подкласс для final-класса
class B extends A {
    public void test() {
        display();
    }
}

public class Main {
    public static void main(String[] args) {
        B b;
        b.test();
    }
}