import java.lang.String;
public class EmployeeDatabase extends LinkedList<Employee>
{    
    private LinkedList<Employee> databaseLinkedList = new LinkedList<Employee>();

    public EmployeeDatabase()
    {
        databaseLinkedList = null;
    }

    public void adds(Employee employeeInput)
    {
        LLNode<Employee> temp = new LLNode(employeeInput, null);
        if(databaseLinkedList == null)
        {
            databaseLinkedList.setFirstNode(temp);
        }
        else
        {
            databaseLinkedList.addToFront(employeeInput);
        }
    }

    public Employee find(String firstNameInput, String lastNameInput, String numberInput) throws NoSuchEmployeeException
    {
        try 
        {
            LLNode<Employee> temp = databaseLinkedList.getFirstNode();
            for(int i = 0; i < databaseLinkedList.length() - 1; i++)
            {
                if(temp.getElement().getFirstName().equals(firstNameInput) && temp.getElement().getLastName().equals(lastNameInput) && temp.getElement().getNumber().equals(numberInput))
                {
                    return temp.getElement();
                }
                else
                {
                    temp = temp.getNext();
                }
            }
            throw new NoSuchEmployeeException();
        }
        catch (NoSuchEmployeeException e)
        {
            System.out.println("There is no such employee");
            return null;
        }
    }

    public void remove(String firstNameInput, String lastNameInput, String numberInput)
    {

    }

}
