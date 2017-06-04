public class Monkey extends LandAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("he he he ha ha ha");
    }
}