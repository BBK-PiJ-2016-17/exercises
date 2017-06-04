public class Bear extends LandAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Bear(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("BEARRRRRR");
    }
}