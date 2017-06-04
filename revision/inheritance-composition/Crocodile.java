public class Crocodile extends AcquaticAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("Teeth grinding?");
    }
}