/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Person;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PersonDirectory {
    private ArrayList<Person>personList;

    public PersonDirectory() {
    personList= new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public Person crePerson(){
    Person p= new Person();
    personList.add(p);
    return p;
    }
    
}
