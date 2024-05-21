package book;

import java.util.ArrayList;

interface ContactsI{
    ArrayList<Contact> getAll();
}

class InMemoryContactsTest implements ContactsI {

    private ArrayList<Contact> contacts = new ArrayList<>();


    public InMemoryContactsTest() {
        contacts.add(new Contact("Test","Test"));
        contacts.add(new Contact("Test1","Test1"));
        contacts.add(new Contact("Test2","Test2"));
    }

    @Override
    public ArrayList<Contact> getAll(){
        return contacts;
    }

}


public class InMemoryContacts implements ContactsI {

    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    public ArrayList<Contact> getAll(){
        return contacts;
    }

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(int index){
        contacts.remove(index);
    }

}
