/**
 * this abstract class explore common traits of all three kinds of supervisor
 * @author dxl746
 */

public abstract class Supervisor
{
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract void setName(String firstName, String lastName);
    
    public abstract String getNumber();

    public abstract double getBonus();

    public abstract void setBonus(double bonus);

    public abstract double getAmountEarned();

    public abstract void adjustPay(double percentage);

    public abstract boolean equals(Supervisor supervisor1, Supervisor supervisor2);

    public abstract String toString();
    
    public abstract int compareToByName(String name);

    public abstract int compareToByEarning(double earning);

    public abstract void setSupervisor(Supervisor supervisorInput);

    public abstract Supervisor getSupervisor();

}
