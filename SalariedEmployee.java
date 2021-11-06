/**
 * A <code>SalariedEmployee</code> class represent employee paid by fixed salary. 
 * In order to create a<code>SalariedEmployee</code>, one's 
 * @author dxl746
 */
public class SalariedEmployee extends Employee
{
    // this field stores the first name of employee
    private String firstName;

    // this field stores the last name of employee
    private String lastName;

    // this field stores the serial number of the employee
    private String number;

    // this field stores the salary of the employee
    private double salary;

    // this field stores the bouns of the employee
    private double bonus;

    // this field stores the supervisor of the employee
    private Supervisor supervisor;

    /**
     * @param firstNameInput The first name of employee
     * @param lastNameInput The last name of employee
     * @param numberInput The serial number of employee
     * @param salaryInput 
     */
    public SalariedEmployee(String firstNameInput, String lastNameInput, String numberInput, double salaryInput)
    {
        this.firstName = firstNameInput;
        this.lastName = lastNameInput;
        this.number = numberInput;
        this.salary = salaryInput; 
    }


    
    /** 
     * @return <code>firstName</code> The first name of employee
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return <b>lastName</b> The last name of employee
     */
    public String getLastName()
    {
        return lastName;
    }


    
    /** 
     * @param firstNameInput The first name 
     * @param lastNameInput The last name 
     */
    public void setName(String firstNameInput, String lastNameInput)
    {
        firstName = firstNameInput;
        lastName = lastNameInput;
    }

    
    /** 
     * @return String
     */
    public String getNumber()
    {
        return number;
    }

    
    /** 
     * @return double
     */
    public double getSalary()
    {
        return salary;
    }

    
    /** 
     * @param salaryInput
     */
    public void setSalary(double salaryInput)
    {
        salary = salaryInput;
    }

    
    /** 
     * @return double
     */
    public double getBonus()
    {
        return bonus;
    }

    
    /** 
     * @param bonusInput
     */
    public void setBonus(double bonusInput)
    {
        bonus = bonusInput;
    }

    
    /** 
     * @return double
     */
    public double getAmountEarned()
    {
        return getBonus()+getSalary();
    }

    
    /** 
     * @param percentage
     */
    public void adjustPay(double percentage)
    {
        double salaryTemp = this.getSalary() * (1.0+percentage);
        this.setSalary(salaryTemp);
    }

    
    /** 
     * @return String
     */
    public String toString()
    {
        return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Salaried Employee";
    }

    
    /** 
     * @param employeeInput1
     * @param employeeInput2
     * @return boolean
     */
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

    
    /** 
     * @param employeeInput
     * @return int
     */
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
    
    
    /** 
     * @param employeeInput
     * @return int
     */
    public int compareToByEarning(Employee employeeInput)
    {
        return (int)(this.getAmountEarned() - employeeInput.getAmountEarned()); 
    } 

    
    /** 
     * @param supervisorInput
     */
    public void setSupervisor(Supervisor supervisorInput)
    {
        supervisor = supervisorInput;
    }

    
    /** 
     * @return Supervisor
     */
    public Supervisor getSupervisor()
    {
        return supervisor;
    }
    
}