package book;

import java.util.ArrayList;


public class ShowContactsMenuAction implements MenuAction {

    private InMemoryContacts memoryContacts;

    public ShowContactsMenuAction(InMemoryContacts memoryContacts) {
        this.memoryContacts = memoryContacts;
    }

    @Override
    public String getName() {
        return "Показати усі контакти";
    }

//    public void executeTest(ContactsI contacts){
//        if (contacts == null){
//            System.out.println("Не ініціалізоване значення");
//            return;
//        }
//        for (int i = 0; i < contacts.getAll().size(); i++) {
//            System.out.println(contacts.getAll().get(i));
//        }
//    }

    @Override
    public void execute() {
        ArrayList<Contact> contacts = memoryContacts.getAll();
        System.out.println("=================");
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(i+1 + " " + contact.getName() + " " + contact.getPhoneNumber());
        }
        System.out.println("=================");

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
