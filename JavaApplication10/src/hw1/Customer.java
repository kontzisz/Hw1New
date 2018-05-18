/*
testtttt
 */
package hw1;

/**
 *
 * @author kumar
 */
public class Customer extends StorePerson
{
    
    public Customer(String name, String phone, String address)
    {
        super(name, phone, address);
        this.personType = "Customer";
    }
    
    public String toString()
    {
        return super.toString();
    }
}
