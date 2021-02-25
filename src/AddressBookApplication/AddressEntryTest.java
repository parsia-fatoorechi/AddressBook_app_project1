package AddressBookApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class
 *
 * @author parsia fatoorechi
 */
class AddressEntryTest {
    /**
     * 1st test
     */
    @Test
    void testToString() {
    }

    /**
     * 1st test
     */
    @Test
    void test1SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "John";
        entry.setFirstName(name1);
        assertEquals(entry.getfirstName(), name1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "James";
        entry.setFirstName(name1);
        assertEquals(entry.getfirstName(), name1);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetFirstName() {
        AddressEntry entry = new AddressEntry("micheal", "jordan", "winchester", "deleware", "ok", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getfirstName(), "John");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetFirstName() {
        AddressEntry entry = new AddressEntry("flex", "wheeler", "winchester",
                "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getfirstName(), "flex");
    }

    /**
     * 1st test
     */
    @Test
    void test1SetLastName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "Doe";
        entry.setlastName(name1);
        assertEquals(entry.getlastName(), name1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetLastName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "Keaton";
        entry.setlastName(name1);
        assertEquals(entry.getlastName(), name1);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetLastName() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getlastName(), "wheeler");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetLastName() {
        AddressEntry entry = new AddressEntry("flex", "shumacher",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getlastName(), "shumacher");
    }

    /**
     * 1st test
     */
    @Test
    void test1SetCity() {
        AddressEntry entry = new AddressEntry();
        String city1 = "Hayward";
        entry.setcity(city1);
        assertEquals(entry.getcity(), city1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetCity() {
        AddressEntry entry = new AddressEntry();
        String city2 = "nappa";
        entry.setcity(city2);
        assertEquals(entry.getcity(), city2);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetCity() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getcity(), "san jose");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetCity() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "santa clara", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getcity(), "santa clara");
    }

    /**
     * 1st test
     */
    @Test
    void test1SetState() {
        AddressEntry entry = new AddressEntry();
        String state1 = "CA";
        entry.setstate(state1);
        assertEquals(entry.getstate(), state1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetState() {
        AddressEntry entry = new AddressEntry();
        String state2 = "AB";
        entry.setstate(state2);
        assertEquals(entry.getstate(), state2);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetState() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getstate(), "CA");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetState() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "TX", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getstate(), "TX");
    }

    /**
     * 1st test
     */
    @Test
    void test1SetStreet() {
        AddressEntry entry = new AddressEntry();
        String street1 = "winchester";
        entry.setstreet(street1);
        assertEquals(entry.getstreet(), street1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetStreet() {
        AddressEntry entry = new AddressEntry();
        String street2 = "Samaritan dr";
        entry.setstreet(street2);
        assertEquals(entry.getstreet(), street2);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetStreet() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getstreet(), "winchester");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetStreet() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "san carlos", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getstreet(), "san carlos");
    }

    /**
     * 1st test
     */
    @Test
    void test1SetZip() {
        AddressEntry entry = new AddressEntry();
        int zip1 = 94544;
        entry.setzip(zip1);
        assertEquals(entry.getzip(), zip1);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetZip() {
        AddressEntry entry = new AddressEntry();
        int zip2 = 95035;
        entry.setzip(zip2);
        assertEquals(entry.getzip(), zip2);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetZip() {
        AddressEntry entry = new AddressEntry("james", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getzip(), 83924);
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetZip() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83524);
        assertEquals(entry.getzip(), 83524);
    }

    /**
     * 1st test
     */
    @Test
    void test1SetPhone() {
        AddressEntry entry = new AddressEntry();
        String phone = "123-345-4324";
        entry.setphone(phone);
        assertEquals(entry.getphone(), phone);
    }

    /**
     * 2nd test
     */
    @Test
    void test2SetPhone() {
        AddressEntry entry = new AddressEntry();
        String phone = "408-408-6789";
        entry.setphone(phone);
        assertEquals(entry.getphone(), phone);
    }

    /**
     * 1st test for getPhone method
     */
    @Test
    void test1GetPhone() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getphone(), "123-345-4324");
    }

    /**
     * 2nd test for getPhone method
     */
    @Test
    void test2GetPhone() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getphone(), "123-345-4324");
    }

    /**
     * 1st test for setEmail method
     */
    @Test
    void test1SetEmail() {
        AddressEntry entry = new AddressEntry();
        String email1 = "test.com";
        entry.setEmail(email1);
        assertEquals(entry.getEmail(), email1);
    }

    /**
     * 2nd test for setEmail method
     */
    @Test
    void test2SetEmail() {
        AddressEntry entry = new AddressEntry();
        String email2 = "joe@sleepy.com";
        entry.setEmail(email2);
        assertEquals(entry.getEmail(), email2);
    }

    /**
     * 1st test
     */
    @Test
    void test1GetEmail() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getEmail(), "test.com");
    }

    /**
     * 2nd test
     */
    @Test
    void test2GetEmail() {
        AddressEntry entry = new AddressEntry("flex", "wheeler",
                "winchester", "san jose", "CA", "test.com", "123-345-4324", 83924);
        assertEquals(entry.getEmail(), "test.com");
    }
}