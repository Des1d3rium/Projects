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
    private Supervisor supervisor;

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

    public boolean equals(Employee employeeInput1, Employee employeeInput2)
    {
        if(employeeInput1.getFirstName().equals(employeeInput2.getFirstName()))
        {
            if(employeeInput1.getLastName().equals(employeeInput2.getLastName()))
            {
                if(employeeInput1.getNumber() == employeeInput2.getNumber())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int compareToByName(Employee employeeInput)
    {
        if(this.getLastName().compareToIgnoreCase(employeeInput.getLastName()) == 0)
        {
            return this.getFirstName().compareToIgnoreCase(employeeInput.getFirstName());
        }
        else
        {
            return this.getLastName().compareToIgnoreCase(employeeInput.getLastName());
        }
    }
    
    public int compareToByEarning(Employee employeeInput)
    {
        return (int)(this.getAmountEarned() - employeeInput.getAmountEarned()); 
    } 

    public void setSupervisor(Supervisor supervisorInput)
    {
        supervisor = supervisorInput;
    }

    public Supervisor getSupervisor()
    {
        return supervisor;
    }
    
}