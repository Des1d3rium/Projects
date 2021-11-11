public class SalesSupervisor extends Employee
{
    // this field stores the first name 
    private String firstName;

    // this field stores the last name 
    private String lastName;
    
    // this field stores the serial number 
    private String number;
    
    // this field stores the salary. Salary is fixed to one employee
    private double salary;

    // this field stores ones commission
    private double commission; 

    // this field stores how many sales have been made
    private int numberSales;
    
    // this field stores the bouns. Bonus is variable to one employee
    private double bonus;
    
    // this field stores the supervisor 
    private Employee supervisor;
    
    /**
     * @param firstNameInput The first name 
     * @param lastNameInput The last name 
     * @param numberInput The serial number 
     * @param salaryInput The fixed salary
     */
    public SalesSupervisor(String firstNameInput, String lastNameInput, String numberInput, double salaryInput, double commissionInput)
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
        double commissionTemp = this.getCommission() * (1.0 + percentage);
        this.setCommission(commissionTemp);
    }
    
    
    /** 
     * @return String
     */
    public String toString()
    {
        return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Sales Supervisor";
    }
    
    
    /** 
     * @param supervisorInput1
     * @param supervisorInput2
     * @return boolean
     */
    public boolean equals(Employee supervisorInput1, Employee supervisorInput2)
    {
        if(supervisorInput1.getFirstName().equals(supervisorInput2.getFirstName()))
        {
        if(supervisorInput1.getLastName().equals(supervisorInput2.getLastName()))
        {
            if(supervisorInput1.getNumber() == supervisorInput2.getNumber())
            {
            return true;
            }
        }
        }
        return false;
    }
    
    
    /** 
     * @param supervisorInput2
     * @return int
     */
    public int compareToByName(Employee supervisorInput2)
    {
        if(this.getLastName().compareToIgnoreCase(supervisorInput2.getLastName()) == 0)
        {
        return this.getFirstName().compareToIgnoreCase(supervisorInput2.getFirstName());
        }
        else
        {
        return this.getLastName().compareToIgnoreCase(supervisorInput2.getLastName());
        }
    }
    
    
    /** 
     * @param supervisorInput2
     * @return int
     */
    public int compareToByEarning(Employee supervisorInput2)
    {
        return (int)(this.getAmountEarned() - supervisorInput2.getAmountEarned()); 
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
