package lesson3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AppRun {
    public static void main(String[] args) throws NotFoundEx {
        String[] allWords = {"apple", "orange", "lemon", "banana", "apricot", "mango", "broccoli", "carrot",
                "nut", "apple", "grape", "melon", "banana", "kiwi", "mango", "nut", "nut", "olive",
                "pea", "apple", "pear", "pepper", "banana", "nut", "mango"};
        Set<String> words = new HashSet<>(Arrays.asList(allWords));
        for (String word : words) {
            int count = 0;
            for (String string : allWords) {
                if (string.equals(word)) {
                    count++;
                }
            }
            System.out.println(word + ": " + count);
        }
        System.out.println("\nPhone Book:");
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Sidorov", "+7(915)785-96-24");
        System.out.println(phoneBook.get(contact));
        phoneBook.add(new Contact("Sidorov", "+7(915)785-96-24"));
        phoneBook.add(new Contact("Petrov", "+7(916)845-32-69"));
        phoneBook.add(new Contact("Sidorov", "+7(917)289-96-24"));
        Contact testEx = new Contact("qwe", "123");
        try {
            phoneBook.get(testEx);
            phoneBook.get(contact);
        } catch (NotFoundEx notFoundEx) {
            System.out.println(notFoundEx.getMessage());
        }
        phoneBook.getAll();
    }
}
