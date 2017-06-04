public class Pigeon extends FlyingAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("coo coo coo");
    }
}