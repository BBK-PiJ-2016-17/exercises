public class Whale extends AcquaticAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Whale(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("Whoooo whooo whaaa");
    }
}