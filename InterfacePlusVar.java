public class InterfacePlusVar {
    public static void main(String[] args) {
        var animal = new Dog(); 
        animal.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}