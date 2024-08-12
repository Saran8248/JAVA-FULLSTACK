class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double percentageIncrease) {
        salary += salary * (percentageIncrease / 100);
    }

    public void display() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 60000);
        employee.display();
        
        employee.updateSalary(10); 
        System.out.println("After salary update:");
        employee.display();
    }
}
