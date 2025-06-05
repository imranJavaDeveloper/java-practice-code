abstract class Employee {
    String name;
    int empId;

    // Constructor
    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int empId, int hoursWorked, double hourlyRate) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 80, 300);

        emp1.displayDetails();
        System.out.println("Salary: ₹" + emp1.calculateSalary());

        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: ₹" + emp2.calculateSalary());
    }
}
