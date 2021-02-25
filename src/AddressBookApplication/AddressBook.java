package AddressBookApplication;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/**
 * This Class holds a collection of objects of AddressEntry class.
 * This class contains an inner class SortLn which overrides the comparator class's compare() method.
 * used to sort elements based on lastName field.
 * contains a List method that lists all the elements in the container.
 * contains an add method for adding to the list.
 * contains a find method that finds elements.
 * contains a remove method for removing elements.
 * contains a sort method for Sorting the Address Book based on last Names.
 *
 * @author parsia fatoorechi.
 */

public class AddressBook {

	public ArrayList<AddressEntry> addressEntryList;

	public AddressBook() {
		addressEntryList = new ArrayList<>();
	}

	/**
	 * this method lists all the elements in the
	 * container by iterating and calling toString on each obect.
	 */

	public void list() {
		// sorts the elements of AddressEntryList
		this.Sort();
		int AddressBookLength = addressEntryList.size();

		for (int i = 0; i < AddressBookLength; i++)
			System.out.println(addressEntryList.get(i).toString());
	}

	/**
	 * adds a single Address Entry object
	 **/
	public void add(AddressEntry e) {
		this.addressEntryList.add(e);
	}

	/**
	 * reads data from a file, creates an new AddressEntry object for each string stored and adds
	 * the object to our AddressBook arraylist. for more info see java.nio.file
	 *
	 * @param pathName a String to indicate the location of the file to be read
	 */
	public void readFromFile(String pathName) {
		int AddressBookLength = addressEntryList.size();
		try {
			ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(pathName)));

			for (String s : list) {
				AddressEntry e = new AddressEntry();
				ArrayList<String> entryList = new ArrayList<>(Arrays.asList(s.split(",")));
				e.setFirstName(entryList.get(0));
				e.setlastName(entryList.get(1));
				e.setstreet(entryList.get(2));
				e.setcity(entryList.get(3));
				e.setstate(entryList.get(4));
				e.setEmail(entryList.get(5));
				e.setphone(entryList.get(6));
				e.setzip(Integer.parseInt(entryList.get(7).trim()));

				add(e);
			}
			System.out.println(AddressBookLength + " Addresses added to the Address Book.");
		} catch (IOException exception) {
			System.out.println(exception);
		}
	}

	/**
	 * Method to find entries in our AddressBook array by lastName and returns the
	 * resulting Arraylist.
	 *
	 * @param lnStart a string representing first character of
	 *                AddressBook array
	 * @return a modified list of addressEntry objects that start with specified character.
	 */
	public ArrayList<AddressEntry> find(String lnStart) {

		int AddressBookLength = addressEntryList.size();
		ArrayList<AddressEntry> foundList = new ArrayList<>();

		for (int i = 0; i < AddressBookLength; i++) {
			if (addressEntryList.get(i).getlastName().toLowerCase().
					startsWith(lnStart.toLowerCase())) {
				foundList.add(addressEntryList.get(i));
			}
		}
		return foundList;
	}

	/**
	 * remove method for removing elements.
	 *
	 * @param e object of AddressEntry.
	 */
	public void remove(AddressEntry e) {
		addressEntryList.remove(e);
	}

	/**
	 * sorts the elements based on lastName field.
	 */
	public void Sort() {
		addressEntryList.sort(new SortLn());
	}
	/**
	 * getter that returns the Address Book
	 * @return the Address Book list.
	 */
	public ArrayList<AddressEntry> getAddressEntryList() {
		return addressEntryList;
	}
	/**
	 * innerclass for overriding compare method.
	 */
	public class SortLn implements Comparator<AddressEntry> {
	@Override
		public int compare(AddressEntry o1, AddressEntry o2) {
		return o1.getlastName().compareToIgnoreCase(o2.getlastName());
		}
	}
}



