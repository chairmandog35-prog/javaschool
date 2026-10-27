import java.util.Scanner;

class Employee{
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.printf("Calculated Salary: %.2f%n", calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

    @Override
    public void displayInfo(){
        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println("Name: "+name);
        System.out.println("Type: Full-Time Employee");
        System.out.printf("Monthly Salary: %.2f%n",monthlySalary);
    }

}

class PartTimeEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override 
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override 
    public void displayInfo(){
        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println("Name: "+name);
        System.out.println("Type: Part-Time Employee");
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.printf("Calculated Salary: %.2f%n",calculateSalary());
    }
}

public class activity1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee type: ");
        String type = scanner.nextLine().trim();

        Employee employee = null;

        if(type.equalsIgnoreCase("f")){
            System.out.println("Enter monthly salary: ");
            double monthlySalary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, monthlySalary);
        }else if(type.equalsIgnoreCase("p")){
            System.out.println("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            employee = new PartTimeEmployee(name, hoursWorked, hourlyRate);
        }else{
            System.out.println("Invalid employee type!");
        }

        if(employee != null){
            employee.displayInfo();
        }

        scanner.close();
    }
}
