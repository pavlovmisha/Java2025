class A {
    // Объявляем метод как final
    public final void displayMessage() {
        System.out.println("Это метод суперкласса A");
    }
}

class B extends A {
    // Попытка переопределить final-метод
    @Override
    public void displayMessage() {  // В этом месте будет ошибка компиляции
        System.out.println("Это метод подкласса B");
    }
}

public class Main {
    public static void main(String[] args) {
        B b;
        b.displayMessage();
    }
}