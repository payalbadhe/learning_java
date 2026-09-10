
class Employee {

    int salary = 30000;
}

class Manager extends Employee {

    int salary = 60000;

    void getDetails() {
        System.out.println("Manager Salary: " + salary);
        System.out.println("Employee Salary: " + super.salary);
    }
}

public class super_ex2 {

    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.getDetails();
    }
}
