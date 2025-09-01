package animals;

public class Parrot extends Pets{
    int paws;

    public Parrot(int paws) {
        super(paws);
    }

    @Override
    public void makeSound() {
        System.out.println("Chik-chirik");
    }
}
