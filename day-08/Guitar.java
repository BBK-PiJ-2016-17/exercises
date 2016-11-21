public class Guitar {
    // In order to have both the play() method from MusicalInstrument
    // And the burn() method from WoodenObject class
    // I would use composition

    private MusicalInstrument guitarInstrument = new MusicalInstrument();
    private WoodenObject guitarBurn = new WoodenObject();

    public String play(String sound) {
        guitarInstrument.play(sound);
        return sound;
    }

    public int burn(int temperature) {
        guitarBurn.burn(temperature);
        return temperature;
    }

    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();

        String playing = myGuitar.play("G A F");
        int degrees = myGuitar.burn(350);

        System.out.println("I'm playing these chords: " + playing);
        System.out.println("The guitar will burn at " + degrees + " degrees.");
    }
}