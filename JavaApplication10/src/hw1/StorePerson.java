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
public class StorePerson 
{
    public int personID;
    public String name;
    public String phone;
    public String address;
    public static int personCount = 0;
    public String personType = "";
    
    public StorePerson(String name, String phone, String address)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.personID = personCount++;
        this.personType = personType;
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String address()
    {
        return this.address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String toString()
    {
        
        String temp = "";
        temp += "Person Type: " + this.personType + "ID: " + this.personID + "Name: " + this.name + 
                "Phone: " + this.phone + "Address: " + this.address;
        
        return temp;
    }
}
