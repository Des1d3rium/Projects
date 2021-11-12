/**
 * A <code>SalariedEmployee</code> class represent employee paid by fixed salary. 
 * Here are some example of how it could be used: <br></br>
 * <code>SalariedEmployee johnDoe = new SalariedEmployee("John", "Doe", 0001, 2000)</code>
 * 
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
    private Employee supervisor;

    /**
     * @param firstNameInput The first name of employee
     * @param lastNameInput The last name of employee
     * @param numberInput The serial number of employee
     * @param salaryInput The fixed salary
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
    public boolean equals(Employee employeeInput2)
    {
        if(this.getFirstName().equals(employeeInput2.getFirstName()))
        {
            if(this.getLastName().equals(employeeInput2.getLastName()))
            {
                if(this.getNumber().equals(employeeInput2.getNumber()))
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
    public void setSupervisor(Employee supervisorInput)
    {
        supervisor = supervisorInput;
    }

    
    /** 
     * @return Supervisor
     */
    public Employee getSupervisor()
    {
        return supervisor;
    }
    
}