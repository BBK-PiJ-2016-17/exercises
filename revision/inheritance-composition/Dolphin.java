public class Dolphin extends AcquaticAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("dolphing telepathy sound.");
    }
}