
public class AddressBook {
    public static void main (String[] args) {
        Interface person = new Person();
        person.createContact();
        person.addContact();
        person.editContact();
    }
}
