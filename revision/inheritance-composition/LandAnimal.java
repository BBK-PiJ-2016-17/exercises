public abstract class LandAnimal implements Animal {
    private String name;

    public LandAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call() {
        System.out.println(name + " will come...");
    }
}