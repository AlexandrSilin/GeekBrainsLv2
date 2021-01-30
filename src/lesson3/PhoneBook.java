package lesson3;

import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private Set <Contact> phoneBook;

    public PhoneBook(){
        this.phoneBook = new TreeSet<>();
    }

    public void add(Contact contact){
        this.phoneBook.add(contact);
    }

    public String get(Contact contact) throws NotFoundEx {
        if (phoneBook.isEmpty()){
            return "Phone book is empty";
        }
        if (!this.phoneBook.contains(contact)) {
            throw new NotFoundEx();
        }
        return contact.toString();
    }

    public void getAll(){
        for (Contact contact : phoneBook)
                System.out.println(contact);
    }
}
