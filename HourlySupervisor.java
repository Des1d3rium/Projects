public class HourlySupervisor extends Employee
{
    // this field stores the first name 
    private String firstName;

    // this field stores the last name
    private String lastName;
    
    // this field stores the serial number 
    private String number;
    
    // this field stores the hourly rate
    private double hourlyRate;

    // this field stores the work hour
    private double hoursWorked;
    
    // this field stores the bouns
    private double bonus;
    
    // this field stores the supervisor
    private Employee supervisor;
    
    /**
     * @param firstNameInput The first name 
     * @param lastNameInput The last name 
     * @param numberInput The serial number 
     * @param salaryInput The fixed salary
     */
    public HourlySupervisor(String firstNameInput, String lastNameInput, String numberInput, double hourlyRateInput)
    {
        this.firstName = firstNameInput;
        this.lastName = lastNameInput;
        this.number = numberInput;
        this.hourlyRate = hourlyRateInput;
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
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    
    /** 
     * @param hourlyRate
     */
    public void setHourlyRate(double hourlyRateInput)
    {
        hourlyRate = hourlyRateInput;
    }
    
    /**
    * @return <code>hoursWorked</code> the hours this employee has worked
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorkedInput)
    {
        hoursWorked = hoursWorkedInput;
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
        return getBonus() + getHourlyRate() * getHoursWorked();
    }
    
    
    /** 
     * @param percentage
     */
    public void adjustPay(double percentage)
    {
        double hourlyTemp = this.getHourlyRate() * (1.0 + percentage);
        this.setHourlyRate(hourlyTemp);
    }
    
    
    /** 
     * @return String
     */
    public String toString()
    {
        return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Hourly Supervisor";
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
     * @param supervisorInput
     * @return int
     */
    public int compareToByEarning(Employee supervisorInput)
    {
        return (int)(this.getAmountEarned() - supervisorInput.getAmountEarned()); 
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
