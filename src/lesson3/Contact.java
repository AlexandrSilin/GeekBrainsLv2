package lesson3;

public class Contact implements Comparable <Contact> {
    private final String lastName;
    private final String phoneNumber;

    public Contact(String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Contact contact) {
        if (this.equals(contact)) {
            return 0;
        }
        for (int i = 0; i < Math.min(this.lastName.length(), contact.lastName.length()); i++){
            if (this.lastName.charAt(i) < contact.lastName.charAt(i)){
                return -1;
            }
        }
        return 1;
    }

    @Override
    public String toString(){
        return "Last name:" + this.lastName + ", phone number: " + this.phoneNumber;
    }
}
