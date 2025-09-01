import animals.Cat;
import animals.Dog;
import animals.Parrot;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4);
        Cat cat1 = new Cat(4);
        dog1.makeSound();
        cat1.makeSound();
        Parrot parrot1 = new Parrot(2);
        parrot1.makeSound();
    }
}