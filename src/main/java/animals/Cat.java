package animals;

public class Cat extends Pets {
    int paws;

    public Cat(int paws) {
        super(paws);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
