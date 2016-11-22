/**
 * Ex 5 - Multiple inheritance
 * Create a class MusicalInstrument with a method play(). Now create another
 * class WoodenObject with a method burn().
 * Create a class Guitar that is at the same time a musical instrument and a
 * wooden object. How would you do it in Java?
*/

public class MusicalInstrument {
    private String sound = null;
    public String play(String sound) {
        this.sound = sound;
        return sound;
    }
}