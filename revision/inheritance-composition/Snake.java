public class Snake extends LandAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Snake(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("Silent as a snake.");
    }
}