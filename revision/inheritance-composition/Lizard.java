public class Lizard extends LandAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Lizard(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("sounds like a frog but softer?");
    }
}