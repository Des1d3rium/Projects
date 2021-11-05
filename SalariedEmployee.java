import javax.swing.BoundedRangeModel;
import java.lang.Math;

/**
 * this class contains behaviours of a salaried employee
 * @author dxl746
 */
public class SalariedEmployee extends Employee
{
    private String firstName;
    private String lastName;
    private String number;
    private double salary;
    private double bonus;

    public SalariedEmployee(String firstNameInput, String lastNameInput, String numberInput, double salaryInput)
    {
        this.firstName = firstNameInput;
        this.lastName = lastNameInput;
        this.number = numberInput;
        this.salary = salaryInput; 
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setName(String firstNameInput, String lastNameInput)
    {
        firstName = firstNameInput;
        lastName = lastNameInput;
    }

    public String getNumber()
    {
        return number;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salaryInput)
    {
        salary = salaryInput;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonusInput)
    {
        bonus = bonusInput;
    }

    public double getAmountEarned()
    {
        return getBonus()+getSalary();
    }

    public void adjustPay(double percentage)
    {
        double salaryTemp = this.getSalary() * (1.0+percentage);
        this.setSalary(salaryTemp);
    }

    public String toString()
    {
        return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Salaried Employee";
    }

    public boolean equals(Employee employee1, Employee employee2)
    {
        if(employee1.getFirstName().equals(employee2.getFirstName()))
        {
            if(employee1.getLastName().equals(employee2.getLastName()))
            {
                if(employee1.getNumber() == employee2.getNumber())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int compareToByName(Employee employee1)
    {
        if(this.getLastName().compareToIgnoreCase(employee1.getLastName()) == 0)
        {
            return this.getFirstName().compareToIgnoreCase(employee1.getFirstName());
        }
        else
        {
            return this.getLastName().compareToIgnoreCase(employee1.getLastName());
        }
    }
}