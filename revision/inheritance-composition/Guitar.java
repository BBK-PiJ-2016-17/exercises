public class Guitar {

    // In order to have both the play() method from MusicalInstrument
    // And the burn() method from WoodenObject class
    // I would use composition
    
    private MusicalInstrument mi = new MusicalInstrument();
    private WoodenObject wo = new WoodenObject();

    public void play(String piece) {
        System.out.println(piece);
    }

    public void burn() {
        System.out.println("I'm burning.");
    }
}