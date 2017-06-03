public class LecturerTest {
    public static void main(String[] args) {
        LecturerTest test = new LecturerTest();
        test.launch();
    }

    public void launch() {
        Teacher teacher = new Teacher("Teacher's name");
        Lecturer lecturer = new Lecturer("Lecturer's name");

        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Lecturer: " + lecturer.getName());

        System.out.print ("\nThe lecturer is ");
        lecturer.doResearch("Magma");
    }
}