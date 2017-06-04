public class Salmon extends AcquaticAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Salmon(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("blob blob blob");
    }
}