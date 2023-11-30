package entities2;

public class Employee {

	public String name;
	public double grossSalary;
    public double tax;
    public double percentage;
	
    public double netSalary() {
    	return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }
    
}
