/**
 * this abstract class explore common traits of all three kinds of employee.
 * @author dxl746
 */
public abstract class Employee
{
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract void setName(String firstName, String lastName);
    
    public abstract String getNumber();

    public abstract double getBonus();

    public abstract void setBonus(double bonus);

    public abstract double getAmountEarned();

    public abstract void adjustPay(double percentage);

    public abstract boolean equals(Employee employee2);

    public abstract String toString(); 

    public abstract int compareToByName(Employee employee1);

    public abstract int compareToByEarning(Employee employee1);

    public abstract void setSupervisor(Employee supervisorInput);

    public abstract Employee getSupervisor();
} 
