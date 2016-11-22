/**
 * Ex 5 - Multiple inheritance
 * Create a class MusicalInstrument with a method play(). Now create another
 * class WoodenObject with a method burn().
 * Create a class Guitar that is at the same time a musical instrument and a
 * wooden object. How would you do it in Java?
*/

public class WoodenObject {

    private int temperature = 0;
    
    public int burn(int temperature) {
        this.temperature = temperature;
        return temperature;
    }
}