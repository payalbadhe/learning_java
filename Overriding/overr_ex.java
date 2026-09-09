//base class

class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary; //deault logic
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FulltimeEmployee extends Employee {

    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus; //overridden logic
    }
}

class ParttimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; //custome logic for parttime employee
    }
}

class TemporaryEmployee extends Employee {

    double dailyrate;
    int daysWorked;

    public double calculateSalary() {
        return dailyrate * daysWorked; //custom logic for temporary employee
    }
}

public class overr_ex {

    public static void main(String[] args) {
        FulltimeEmployee fulltimeEmp = new FulltimeEmployee();
        fulltimeEmp.name = "John Doe";
        fulltimeEmp.baseSalary = 50000;
        fulltimeEmp.bonus = 10000;
        fulltimeEmp.displayDetails();

        ParttimeEmployee parttimeEmp = new ParttimeEmployee();
        parttimeEmp.name = "Jane Smith";
        parttimeEmp.hourlyRate = 2000;
        parttimeEmp.hoursWorked = 20;
        parttimeEmp.displayDetails();

        TemporaryEmployee tempEmp = new TemporaryEmployee();
        tempEmp.name = "Piyush";
        tempEmp.dailyrate = 1000;
        tempEmp.daysWorked = 20;
        tempEmp.displayDetails();
    }
}
