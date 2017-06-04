public abstract class AcquaticAnimal implements Animal {
    private String name;

    public AcquaticAnimal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call() {
        System.out.println(name + " will not come...");
    }
}