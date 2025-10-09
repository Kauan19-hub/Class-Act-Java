abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

        
    }

    public String getName() {
        return name;
    
    }

    public int getId() {
         return id;

    }

    public abstract double calculateSalary();

    public void displayInfo() {
            System.out.println("Employee: " + name + " (ID: " + id + ")");
            System.out.println("Salary: $" + calculateSalary());

        }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public double calculateSalary() {
        return monthlySalary;

    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;

    }
}

public class  CompanyPayroll {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee("Johny", 105, 5300);
        Employee emp2 = new SalariedEmployee("Smith", 109, 29, 170);

        emp1.displayInfo();
        System.out.println("---------");
        emp2.displayInfo();
    
    }
}
