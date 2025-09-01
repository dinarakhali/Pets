import animals.Cat;
import animals.Dog;
import animals.Parrot;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.makeSound();
        cat1.makeSound();
        Parrot parrot1 = new Parrot();
        parrot1.makeSound();
    }
}