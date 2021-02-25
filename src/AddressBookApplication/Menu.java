package AddressBookApplication;

import java.io.*;
import java.util.*;

/**
 * menu class used to interact with users and perform requested methods
 * @author Parsia fatoorechi
 */
class Menu {
    /**
     * prompts the user for firstname of contact
     * @param I InputStream object
     * @return string containing first name.
     */
    public static String prompt_FirstName(InputStream I) {

        System.out.println("First Name:");
        System.out.print(">");
        Scanner sc = new Scanner(I);
        return sc.nextLine();
    }

    public static String prompt_LastName(InputStream I) {

        System.out.println("Last Name:");
        Scanner sc = new Scanner(I);
        System.out.print(">");
        return sc.nextLine();
    }

    /**
     * prompts the user for Street of contact
     * @return String containing street name value
     */
    public static String prompt_Street(InputStream I) {

        System.out.println("Street:");
        Scanner sc = new Scanner(I);
        System.out.print(">");
        return sc.nextLine();
    }

    /**
     * prompts user to enter city
     * @return String containing city name value
     */
    public static String prompt_City(InputStream I) {
        Scanner sc = new Scanner(I);
        System.out.println("City:");
        System.out.print(">");
        return sc.nextLine();
    }

    /**
     *  prompts user to enter state
     * @return  String containing state value
     */
    public static String prompt_State(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("State:");
        System.out.print(">");
        return input.nextLine();
    }

    /**
     * prompts user to enter zip code
     * @return  integer decimal containing zip code value
     */
    public static int prompt_Zip(InputStream I) {
        Scanner sc = new Scanner(I);
        String zip;
        System.out.println("Zip:");
        System.out.print(">");
        zip = sc.nextLine();

        return Integer.parseInt(zip);
    }
    /**
     * prompts user to enter phone number
     * @return  String containing phone number value
     */
    public static String prompt_Telephone(InputStream I) {
        Scanner input = new Scanner(I);
        System.out.println("Telephone:");
        System.out.print(">");
        return input.nextLine();
    }
    /**
     * prompts user to enter email
     * @return String containing email
     */
    public static String prompt_Email(InputStream I) {
        Scanner input = new Scanner(I);
        System.out.println("Email:");
        System.out.print(">");
        return input.nextLine();
    }
    /**
     * Static Menu prompt. prompts users, offers a set of choices.
     * @return character containing user's choice.
     */
    public static char prompt_Menu(InputStream I) {
        Scanner input = new Scanner(I);
        System.out.println("----- ****************** -----");
        System.out.println("Please enter in your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("\nf) Quit");
        System.out.println("----- ****************** -----");
        System.out.print(">");
        return input.nextLine().charAt(0);
    }
    //*****NOW you create code for the other methods required for this Exercise ********
}
