import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double basicSalary;
    private double hra;
    private double da;
    private double specialAllowance;

    // Constructor for initializing employee objects

    public Employee(String name, int age, double basicSalary, double hra, double da, double specialAllowance) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.specialAllowance = specialAllowance;
    }

    // Overloaded constructor for employees without special allowance

    public Employee(String name, int age, double basicSalary, double hra, double da) {

        this(name, age, basicSalary, hra, da, 0); // Calls the main constructor with specialAllowance=0
    }

    // Method to calculate the salary with special allowance

    public double calculateSalary() {

        return basicSalary + hra + da + specialAllowance;
    }

    // Method to calculate the salary without special allowance

    public double calculateSalary(double basicSalary, double hra, double da) {

        return basicSalary + hra + da;
    }

    // Display employee details

    public void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Special Allowance: " + specialAllowance);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println();
    }
}

public class EmployeeDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 5 employee objects

        Employee[] employees = new Employee[1];

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");

            String name = scanner.nextLine();
            System.out.print("Age: ");

            int age = scanner.nextInt();
            System.out.print("Basic Salary: ");

            double basicSalary = scanner.nextDouble();
            System.out.print("HRA: ");

            double hra = scanner.nextDouble();
            System.out.print("DA: ");

            double da = scanner.nextDouble();
            System.out.print("Special Allowance: ");

            double specialAllowance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create an employee object based on input

            employees[i] = new Employee(name, age, basicSalary, hra, da, specialAllowance);
        }

        System.out.println("\nEmployee Details:");

        for (Employee emp : employees) {

            emp.displayDetails();
        }

        scanner.close();
    }
}
