package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;

public class Program2 {

	public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Employee employee = new Employee();
       
       System.out.print("Name: ");
       employee.name = sc.nextLine();
       System.out.print("Gross Salary: ");
       employee.grossSalary = sc.nextDouble();
       System.out.print("Tax: ");
       employee.tax = sc.nextDouble();
       
       System.out.println();
       System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
       System.out.println();
       
       System.out.print("Which percentage to incerase salary ? ");
       double percentage = sc.nextDouble();
       employee.increaseSalary(percentage);
       
       System.out.print("Updated data: " + employee.name + ", $ " + employee.netSalary());
       
       sc.close();
	}

}
