import java.util.Scanner;

// Base class Animal
class Animal {
    public void speaks() {
        System.out.println("This animal makes a sound.");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    public void speaks() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    public void speaks() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

public class Animall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the type of animal (dog/cat): \n");
        String animalType = scanner.nextLine().toLowerCase().trim();
        
        Animal animal;
        
        switch (animalType) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            default:
                System.out.println("Invalid input. Defaulting to a generic animal.");
                animal = new Animal();
                break;
        }
        
        animal.speaks();
        
        scanner.close();
    }
}