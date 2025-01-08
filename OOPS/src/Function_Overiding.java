// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Function_Overiding {
    public static void main(String[] args) {
        // Create an object of the parent class
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Output: Animals make sounds

//        // Create an object of the child class
//        Dog myDog = new Dog();
//        myDog.sound();  // Output: Dog barks

//        // Polymorphism: Parent reference, child object
//        Animal polymorphicDog = new Dog();
//        polymorphicDog.sound();  // Output: Dog barks
    }
}
