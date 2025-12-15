class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}


class Example {
    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод устарел");
    }

    // Общий способ использования аннотаций
    @SuppressWarnings("unchecked")
    public void demonstrate() {
        // Используем устаревший метод (с предупреждением)
        oldMethod();

        // Создаем необобщенный список с отключением предупреждения
        List list = new ArrayList(); // без типа, вызывается предупреждение, отключенное аннотацией
        list.add("test");
        System.out.println("Элемент списка: " + list.get(0));
    }
}


public class Main {
    public static void main(String[] args) {
        // Объект Dog, переопределяющий метод
        Dog dog = new Dog();
        dog.makeSound(); // вызов переопределенного метода

        Example example = new Example();
        example.demonstrate(); // использование методов с аннотациями
    }
}