// package oop.inheritance;

//base class
class Animal{
    String color;

    void eat() {
        System.out.println("Animal eats");
    }
    
    void common(){
        System.out.println("Animal");
    }
    void breathe() {
        System.out.println("Animal class Breathes");
    }
}

//Derived class
class Fish extends Animal {

    void common(){
        System.out.println("Fish");
    }
    void swim() {
        System.out.println("Swims in the water");
    }

}
public class BasicConcept {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.common();
        // shark.eat();
        // shark.swim();

    }
}
