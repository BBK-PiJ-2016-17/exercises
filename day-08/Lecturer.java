/**
* A lecturer has both teaching and research responsibilities
*/

public class Lecturer extends Teacher {
    public Lecturer (String name) {
        super(name);
    }

    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }

    public static void main(String[] args) {
        
        Lecturer prof = new Lecturer("This guy");

        prof.teach("A lesson");
        prof.doResearch("This research");
    }
}