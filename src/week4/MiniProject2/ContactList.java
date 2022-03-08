package week4.MiniProject2;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contactArray;

    public ContactList() {
        contactArray = new ArrayList<>();
    }

    public ArrayList<Contact> getContactArray() {
        return contactArray;
    }

    /**
     * Add new contact.
     * return true if it's succeeded to add it.
     * If the input contact with the exact same name and mobile
     * already existed in ContactList, return false.
     *
     * @param newContact
     * @return true / false : succeed to add / fail
     */
    public boolean addContact(Contact newContact) {
        if (contactArray.contains(newContact))
            return false;
        contactArray.add(newContact);
        return true;
    }

    public boolean removeContact(int index) {
        if (index < 0 || contactArray.size() <= index) {
            return false;
        }
        contactArray.remove(index);
        return true;
    }

    public boolean updateContact(int index, Contact updatedContact) {
        if (index < 0 || contactArray.size() <= index) {
            return false;
        }
        contactArray.remove(index);
        contactArray.add(index, updatedContact);
        return true;
    }
}
