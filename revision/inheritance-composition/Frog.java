public class Frog extends AcquaticAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Frog(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("grogging");
    }
}