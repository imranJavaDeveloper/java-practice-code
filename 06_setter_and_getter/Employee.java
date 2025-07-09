public class Employee {
    
    private int id;
    private String name;
    private double salary;

    
    public void setId(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee();

       
        emp.setId(101);
        emp.setName("John Doe");
        emp.setSalary(55000.75);

        
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
