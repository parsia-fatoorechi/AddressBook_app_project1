package AddressBookApplication;

import java.util.*;

/**
 * this class is the Address Book Application class that invokes the main method.
 *
 * @author parsia fatoorechi
 */
public class AddressBookApp {

    /**
     * Main method to run the Address Book application
     * @param args an array of String(s)
     */
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        char option = Menu.prompt_Menu( System.in );
        while (option != 'f') {
            switch(option) {

                case 'a':
                    readFromFile(ab);
                    break;
                case 'b':
                    addEntry(ab);
                    break;
                case 'c':
                    removeEntry(ab);
                    break;
                case 'd':
                    findEntry(ab);
                    break;
                case 'e':
                    ab.list();
                    break;
                default:
                    System.out.println("not an option, try again.");
                    break;
            }
            option = Menu.prompt_Menu(System.in);
        }

        if (option == 'f') {
            System.out.println("program ended");
        }
    }

    /**
     * Method to find a user by last name
     * @param ab an AddressBook instance
     */
    public static void findEntry(AddressBook ab) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter in all or the beginning of the Last Name of the contact you wish to find:");
        System.out.print("> ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> newBook = ab.find(lastName);

        if (newBook.size() > 0) {
            System.out.println("The following " + newBook.size() + " entries were found in the address book for a last name starting with " + lastName);
            for (int i = 0; i < newBook.size(); i++) {
                System.out.println( i+1 + ": " + newBook.get(i).toString() );
            }
        } else {
            System.out.println("No entries found.");
        }
    }
    /**
     * Method to remove an entry in an AddressBook by last name
     * @param ab an AddressBook instance
     */
    public static void removeEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Enter the Last name of contact to remove:");
        System.out.print(">");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = ab.find(lastName);

        if (result.size() <= 0) {
            System.out.println("No entries found");
            return;
        }
        System.out.println("The following " + result.size() + " entries were found in the address book");
        System.out.println("choose # of entry you would like to be removed:");

        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + ": ");
            //index
            int a = i - 1;
            System.out.println(result.get(a));
        }
        System.out.print("> ");
        option = Integer.parseInt(input.nextLine());

        while (option <= 0 || option > result.size()) {
            System.out.println("not an option, try again: ");
            System.out.print("> ");
            option = Integer.parseInt(input.nextLine());
        };
         AddressEntry contact = result.get(option-1);
         ab.remove(contact);
         System.out.println("contact: " + contact.getfirstName() +
                " " + contact.getlastName() + "has been removed.");
    }
    /**
     * prompts user for a single AddressEntry object fields and adds to
     * our AddressBook
     * @param ab an instance of AddressBook
     */
    public static void addEntry(AddressBook ab) {
        AddressEntry entry = new AddressEntry();
        String fn;
        String ln;
        String st;
        String ct;
        String sta;
        int zip;
        String phone;
        String email;

        fn = Menu.prompt_FirstName(System.in);
        entry.setFirstName(fn);

        ln = Menu.prompt_LastName(System.in);
        entry.setlastName(ln);

        st = Menu.prompt_Street(System.in);
        entry.setstreet(st);

        ct = Menu.prompt_City(System.in);
        entry.setcity(ct);

        sta = Menu.prompt_State(System.in);
        entry.setstate(sta);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        zip = Menu.prompt_Zip(System.in);
        entry.setzip(zip);

        phone = Menu.prompt_Telephone(System.in);
        entry.setphone(phone);

        ab.add(entry);

        System.out.println("contact: "+ entry.toString() + "added \n");
    }
    /**
     * Method to read a string for the location of the file to be loaded
     * @param ab an AddressBook instance
     */
    public static void readFromFile(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in filename: ");
        System.out.print("> ");

        ab.readFromFile(input.nextLine());
    }
    public static void initAddressBookExercise(AddressBook ab) {
        // Create 1st instance of AddressEntry
        AddressEntry entry1 = new AddressEntry("John", "Doe", "Stevens creek",
                "Santa clara", "CA", "john@doe.com", "555-55-5555", 95433);
        // using default constructor + setters
        AddressEntry entry2 = new AddressEntry();
        entry2.setFirstName("joe");
        entry2.setlastName("biden");
        entry2.setstreet("white house blvd");
        entry2.setcity("washington dc");
        entry2.setstate("CA");
        entry2.setEmail("joebiden@sleepy.com");
        entry2.setphone("123-456-7890");
        ; entry2.setzip(93434);
        // Add the entries in AddressBook
        ab.add(entry1);
        ab.add(entry2);
    }

}


