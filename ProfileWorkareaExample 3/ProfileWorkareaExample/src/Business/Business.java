/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Department.Department;
import Business.Library.BookDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.LibrarianDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.LibrarianDirectory;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    Department thisDepartment;
    BookDirectory bookDirectory;
    LibrarianDirectory librarianDirectory;


    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();   
        studentdirectory = new StudentDirectory(thisDepartment);
        
        bookDirectory = new BookDirectory();
        librarianDirectory = new LibrarianDirectory();

    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }

    public BookDirectory getBookDirectory() {
    return bookDirectory;
}
    
    public LibrarianDirectory getLibrarianDirectory() {
    return librarianDirectory;
}
}
