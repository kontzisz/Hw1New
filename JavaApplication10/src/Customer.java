/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
