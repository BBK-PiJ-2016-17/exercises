public class Fly extends FlyingAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Fly(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("bzzzzzzzz");
    }
}