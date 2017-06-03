public class GuitarTest {
    public static void main(String[] args) {
        GuitarTest test = new GuitarTest();
        test.launch();
    }

    public void launch() {
        Guitar myGuitar = new Guitar();

        myGuitar.play("My guitar gently weeps");
        myGuitar.burn();
    }
}