public class SalesEmployee extends Employee
{
    // this field stores the first name 
    private String firstName;

    // this field stores the last name 
    private String lastName;

    // this field stores the serial number 
    private String number;

    // this field stores ones salary
    private double salary;

    // this field stores ones commission
    private double commission; 

    // this field stores how many sales have been made
    private int numberSales;

    // this field stores ones bonus
    private double bonus;

    // this field stores the supervisor 
    private Supervisor supervisor;

    /**
     * @param firstNameInput The first name 
     * @param lastNameInput The last name 
     * @param numberInput The serial number 
     * @param salaryInput The fixed salary
     */
    public SalesEmployee(String firstNameInput, String lastNameInput, String numberInput, double salaryInput, double commissionInput)
    {
        this.firstName = firstNameInput;
        this.lastName = lastNameInput;
        this.number = numberInput;
        this.salary = salaryInput; 
        this.commission = commissionInput;
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
    public double getCommission()
    {
        return commission;
    }

    
    /** 
     * @param commissionInput
     */
    public void setCommission(double commissionInput)
    {
        commission = commissionInput;
    }

    
    /** 
     * @return double
     */
    public double getNumberSales()
    {
        return numberSales;
    }

    
    /** 
     * @param numberSalesInput
     */
    public void setNumberSales(int numberSalesInput)
    {
        numberSales = numberSalesInput;
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
        return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Sales Employee";
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
