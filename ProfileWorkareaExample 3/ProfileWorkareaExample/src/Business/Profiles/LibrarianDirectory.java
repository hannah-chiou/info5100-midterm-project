/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author lajon
 */
public class LibrarianDirectory {

    private ArrayList<LibrarianProfile> librarianList;

    public LibrarianDirectory() {
        librarianList = new ArrayList<>();
    }

    public LibrarianProfile newLibrarianProfile(Person p) {
        LibrarianProfile lp = new LibrarianProfile(p);
        librarianList.add(lp);
        return lp;
    }

    public ArrayList<LibrarianProfile> getLibrarianList() {
        return librarianList;
    }
}
