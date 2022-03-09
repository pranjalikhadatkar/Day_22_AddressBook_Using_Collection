import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person implements Interface {
    static Scanner sc = new Scanner( System.in );
    static String firstName, lastName, address, state, email, city;
    static int zip;
    static long phoneNumber;
    ContactInfo infoContact = new ContactInfo();
    Contact contact = new Contact( firstName, lastName, address, city, state, zip, phoneNumber, email );
    static Map<String, Contact> detailsBook = new HashMap<>();
    static Map<String, Contact> personByCity = new HashMap<>();
    Map<String, Contact> personByState = new HashMap<>();
    static Map<String, Map<String, Contact>> book = new HashMap<>();

    public void createContact () {
        System.out.println( "Enter how many contacts you want to create" );
        int numOfContact = sc.nextInt();
        while (numOfContact > 0) {
            System.out.println( "Enter Name of person" );
            String firstName = sc.next();
            if (!detailsBook.containsKey( firstName )) {
                infoContact.info();
                detailsBook.put( firstName, new Contact( firstName, lastName, address, city, state, zip, phoneNumber, email ) );
                numOfContact--;
            } else {
                System.out.println( "Contact already exists!" );
            }
        }
    }

    public void addContact() {
        System.out.println("Enter how many contacts you want to add");
        int numOfContacts = sc.nextInt();
        while (numOfContacts > 0) {
            System.out.println("Enter Name of person");
            String firstName = sc.next();
            if (detailsBook.containsKey(firstName)) {
                System.out.println("Contact already exists!");
                return;
            } else {
                infoContact.info();
                detailsBook.put(firstName, new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
                numOfContacts--;
            }
        }
    }
}
