class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Instanceof {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalDog = new Dog();  

        System.out.println(animal instanceof Animal);  
        System.out.println(dog instanceof Animal);     
        System.out.println(animalDog instanceof Dog);  

        
        CharSequence cs = "Hello";
        System.out.println(cs instanceof CharSequence); 
        System.out.println(cs instanceof String);       
    }
}

