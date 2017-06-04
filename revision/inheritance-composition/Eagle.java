public class Eagle extends FlyingAnimal {

    NonMammal imnotamammal = new NonMammal(super.getName());

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        imnotamammal.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println("According to Google > kikikiki-ki-ki-kuk...kuk...kuk...kuh");
    }
}