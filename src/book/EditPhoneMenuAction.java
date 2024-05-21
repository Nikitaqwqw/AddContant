package book;

import java.util.ArrayList;
import java.util.Scanner;

public class EditPhoneMenuAction implements MenuAction {

    private Scanner scanner;
    private InMemoryContacts inMemoryContacts;

    public EditPhoneMenuAction(Scanner scanner, InMemoryContacts inMemoryContacts) {
        this.scanner = scanner;
        this.inMemoryContacts = inMemoryContacts;
    }

    @Override
    public String getName() {
        return "Редагувати номер контакту";
    }

    @Override
    public void execute() {
        ArrayList<Contact> contacts = this.inMemoryContacts.getAll();
        System.out.println("Виберіть контакт номер телефону якого хочете змінити");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть новий номер телефону");
        String newPhoneNumber = scanner.nextLine();
        System.out.println(newPhoneNumber);
        contacts.get(choice - 1).setPhoneNumber(newPhoneNumber);
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
