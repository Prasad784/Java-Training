import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary");

        double bSalary = scanner.nextDouble();

        double hraPercentage, daPercentage;
        
        
        if (bSalary <= 4000) {

            hraPercentage = 10;
            daPercentage = 50;

        } else if (bSalary <= 8000) {

            hraPercentage  = 20;
            daPercentage = 60;

        } else if (bSalary <= 12000) {

            hraPercentage = 25;
            daPercentage= 70;

        } else {

            hraPercentage = 30;
            daPercentage = 80;
        }

        
        double hra = (hraPercentage / 100) * bSalary;

        double da = (daPercentage / 100) * bSalary;

        
        double grossSalary = bSalary + hra + da;

        System.out.println("Basic Salary: " + bSalary);

        System.out.println("HRA: " + hra);

        System.out.println("DA: " + da);

        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}
