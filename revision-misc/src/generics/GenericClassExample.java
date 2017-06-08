package generics;

public class GenericClassExample {

    public static void main(String[] args) {

        Person<Employee> e1 = new Person<>();
        Person<Contact> c1 = new Person<>();
        Employee e = new Employee("John", "Slattery", "12345");
        Contact c = new Contact("Mrs", "Peggy", "Fisher", "717-555-1212");
        e1.setPerson(e);
        c1.setPerson(c);
        System.out.println(e1.getPerson().toString());
        System.out.println(c1.getPerson().toString());

    }
}
