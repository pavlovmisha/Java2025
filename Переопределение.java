class Animal {
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Собака гавкает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  

        Dog dog = new Dog();
        dog.sound();     

        
        Animal myDog = new Dog();
        myDog.sound();   
    }
}