public abstract class FlyingAnimal implements Animal {
    private String name;

    public FlyingAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call() {
        System.out.println(name + " flying now. Will come later...");
    }
}