
class Employee {

    String company;

    Employee(String company) {
        this.company = company;
        System.out.println("Employee constructor called");
    }

    void getDetails() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {

    String department;

    Manager(String department, String company) {
        super(company);
        this.department = department;
        System.out.println("Manager constructor called");
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Department: " + department);
    }
}

public class ex {

    public static void main(String[] args) {
        Manager manager = new Manager("Sales", "ABC Corp");
    }
}
