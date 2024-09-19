// Superclass
class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Tiger extends Animals {
    @Override
    void makeSound() {
        System.out.println("Tiger roars");
    }
}

// Subclass Cat
class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Animal_DynamicPolymorphism {
    public static void main(String[] args) {
        Animals my_animal;

        my_animal = new Tiger();
        my_animal.makeSound();

        my_animal = new Cat();
        my_animal.makeSound();
    }
}
