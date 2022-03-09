
public class AddressBook {
    public static void main (String[] args) {
        Interface person = new Person();
        person.createContact();
        person.addContact();
        person.editContact();
        person.deleteContact();
        person.displayContact();
        person.addMultiplePerson();
        person.addToBook();
        person.operation();
        person.searchPerson();
        person.displayBook();
    }
}
