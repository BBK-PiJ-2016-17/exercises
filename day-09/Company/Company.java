/**
 * Ex 3 - Day 09 / Generic list
 * Modify the doubly-linked list that you have created in past weeks to make it
 * generic, i.e. to allow it to have values of its elements of any type.
 * Once you have it ready, create a class Company that keeps two linked lists,
 * one with the names of the employees and one with their National Insurance
 * Number.
 */

public class Company {
    public static void main(String[] args) {
        Company test = new Company();
        test.launch();
    }

    public void launch() {
        // I'm trying to create names
        Emloyee<String> name = new Emloyee<String>();

        // I'm trying to create NINos
        Employee<Integer> nin = new Employee<Integer>();

        name.set("Employee One");
        nin.set(717);

        name.set("Emloyee Two");
        nin.set(313);

        
    }
}