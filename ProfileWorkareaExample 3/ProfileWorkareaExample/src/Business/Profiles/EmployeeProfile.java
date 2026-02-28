/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;
import Business.UserAccounts.UserAccount;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {

    private UserAccount ua;

    public EmployeeProfile(Person p) {

        super(p); 

    }
    
    public void setUserAccount(UserAccount ua) {
    this.ua = ua;
    
    }
    
    @Override
    public String getRole(){
        return  "Admin";
    }

}