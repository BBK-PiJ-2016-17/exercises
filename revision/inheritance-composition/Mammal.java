public class Mammal {
    private String name;
    public Mammal(String name) {
        this.name = name;
    }

    public void giveBirth() {
        System.out.println(name + ": Giving birth...");
    }
}