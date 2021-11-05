/**
 * this abstract class explore common traits of all three kinds of employee.
 */
public abstract class employee
{
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract void setName(String firstName, String lastName);
    
    public abstract String getNumber();

    public abstract double getBonus();

    public abstract void setBonus(double bonus);

    public abstract double getAmountEarned();

    public abstract void adjustPay(double percentage);

    public abstract boolean equals(employee employee1, employee employee2);
    
    public abstract int compareToByName(String name);

    public abstract int compareToByEarning(double earning);
} 