public class SalesSupervisor extends Supervisor
{
        // this field stores the first name 
        private String firstName;

        // this field stores the last name 
        private String lastName;
    
        // this field stores the serial number 
        private String number;
    
        // this field stores the salary. Salary is fixed to one employee
        private double salary;
    
        // this field stores the bouns. Bonus is variable to one employee
        private double bonus;
    
        // this field stores the supervisor 
        private Supervisor supervisor;
    
        /**
         * @param firstNameInput The first name 
         * @param lastNameInput The last name 
         * @param numberInput The serial number 
         * @param salaryInput The fixed salary
         */
        public SalesSupervisor(String firstNameInput, String lastNameInput, String numberInput, double salaryInput)
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
            return getNumber() + ": " + getLastName() + ", " + getFirstName() + ", Sales Supervisor";
        }
    
        
        /** 
         * @param supervisorInput1
         * @param supervisorInput2
         * @return boolean
         */
        public boolean equals(Supervisor supervisorInput1, Supervisor supervisorInput2)
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
        public int compareToByName(Supervisor supervisorInput2)
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
        public int compareToByEarning(Supervisor supervisorInput2)
        {
            return (int)(this.getAmountEarned() - supervisorInput2.getAmountEarned()); 
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
