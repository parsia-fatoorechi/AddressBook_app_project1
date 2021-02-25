package AddressBookApplication;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test AddressBook class
 *
 * @author parsia fatoorechi
 */
class AddressBookTest {
    /**
     * test the add function in AddressBook
     */
    @Test
    void testAdd() {
        AddressBook ab = new AddressBook();
        AddressEntry entry = new AddressEntry("John", "Doe", "beverly hills", "LA", "CA", "test.com", "555-555-5555", 90210);
        ab.add(entry);
        assertEquals(ab.find("Doe").get(0), entry);
    }

    /**
     * test the readFromFile function in AddressBook
     */
    @Test
    void testReadFromFile() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("/../../Textcontacts.txt");
    }

    /**
     * test the remove function in AddressBook
     */
    @Test
    void testRemove() {
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Lebron", "james",
                "cupertino st", "vallejo", "CA", "test.com", "***-***-***",94544 );
        AddressEntry entry2 = new AddressEntry("John", "Doe",
                "cupertino dr", "nappa", "CA", "test.com", "***-***-***", 950542);
        ab.add(entry1);
        ab.add(entry2);
        AddressEntry entryToRemove = ab.find("Doe").get(0);

        ab.remove(entryToRemove);
    }

    /**
     * test find method in AddressBook
     */
    @Test
    void testFind() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("../../../Textcontacts.txt");
        AddressEntry entry = ab.find("Doe").get(0);
        assertEquals(entry, ab.getAddressEntryList().get(0));
    }

}