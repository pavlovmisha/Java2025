class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
        System.out.println("Dog constructor");
    }

    @Override
    void sound() {
        super.sound(); 
        System.out.println("Dog barks");
    }

    void printInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
        super.sound();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.sound(); 
        myDog.printInfo(); 
    }
}