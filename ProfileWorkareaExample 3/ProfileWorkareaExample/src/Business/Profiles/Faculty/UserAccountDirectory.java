/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles.Faculty;

import Business.Profiles.*;
import Business.Department.Department;
import Business.Person.Person;
import Business.UserAccounts.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {

    Department department;
    ArrayList<UserAccount> studentlist;

    public UserAccountDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public UserAccount newUserAccount(Person p) {

        UserAccount sp = new UserAccount(p);
        studentlist.add(sp);
        return sp;
    }

    public UserAccount findStudent(String id) {

        for (UserAccount sp : studentlist) {

         //   if (sp.isMatch(id)) {
         //       return sp;
         //   }
        }
            return null; //not found after going through the whole list
         }
    
}
