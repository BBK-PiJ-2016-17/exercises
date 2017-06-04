public class Dog extends LandAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Dog(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("whoof whoof");
    }
}