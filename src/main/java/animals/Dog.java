package animals;

public class Dog extends Pets{
    int paws;

    public Dog(int paws) {
        super(paws);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}