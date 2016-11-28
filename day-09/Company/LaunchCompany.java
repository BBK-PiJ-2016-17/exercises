public class LaunchCompany {
    public static void main(String[] args) {
        LaunchCompany launcher = new LaunchCompany();
        launcher.launch();
    }

    public void launch() {
        
        CompanyManager cm = new CompanyManager();

        Employee<Integer> employeeOne = new Employee<Integer>();
        Employee<String> employeeTwo = new Employee<String>();
        Employee<String> employeeThree = new Employee<String>();

        employeeOne.set(1234);
        employeeTwo.set("Mary");
        employeeThree.set("Rock");

        System.out.println(
            employeeOne.get() + ", " +
            employeeTwo.get() + ", " +
            employeeThree.get()
        );

        cm.addEmployee(employeeOne);
        cm.addEmployee(employeeTwo);

        // cm.addEmployee(employeeThree);
        // cm.addEmployee(employeeFour);
        // cm.addEmployee(employeeFive);
        // cm.addEmployee(employeeSix);
        // cm.addEmployee(employeeSeven);
        // cm.addEmployee(employeeEight);

        cm.printList();
    }
}