public class Beetle extends LandAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Beetle(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("Creepy sound with tiny legs.");
    }
}