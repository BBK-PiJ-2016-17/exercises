public class CompanyManager {
    private Employee<String> firstEmployee = null;
    private Employee<String> lastEmployee = null;

    // this is a member method of class CompanyManager
    public void addEmployee(Employee newEmployee) {
        if (firstEmployee == null) {
            firstEmployee = newEmployee;
            lastEmployee = newEmployee;
            return;
        }

        Employee previous = null;
        Employee current = this.firstEmployee;

        while(current.getNextT() != null) {
            current = current.getNextT();
        }
        current.setNextT(newEmployee);
        newEmployee.setPrevT(current);
        lastEmployee = newEmployee;
    }

    // Print the list
    public void printList() {
        System.out.println(firstEmployee + " " + lastEmployee);
    }
}