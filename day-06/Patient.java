public class Patient {

    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null; // Pointer to another patient!
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getIllness() {
        return this.illness;
    }

    // other methods come here, including getters / setters
    public Patient getNextPatient() {
        return this.nextPatient;
    }

    public void setNextPatient(Patient patient) {
        // Don't I just return a new Patient with the constructor?
        nextPatient = patient;
    }
}