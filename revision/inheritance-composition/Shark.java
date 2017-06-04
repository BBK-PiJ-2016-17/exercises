public class Shark extends AcquaticAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Shark(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("Jaws' soundtrack");
    }
}