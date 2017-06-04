public class Cat extends LandAnimal {

    Mammal imamammal = new Mammal(super.getName());

    public Cat(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imamammal.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println("mewooo");
    }
}