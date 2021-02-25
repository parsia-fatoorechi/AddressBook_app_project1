package AddressBookApplication;

/**
 * this class represents a single entry object, once initialized, will contain each of the user's
 * contact information in a single instance.
 *
 * @author parsia fatoorechi
 */
public class AddressEntry {
	/**
	 * AddressEntry members: first name, last name, street, city, state,
	 */
	String firstName; String lastName; String street; String city;String state; String Email; String phone;
	int zip;

	/**
	 * parameterized constructor.
	 * @param firstName
	 * @param lastName
	 * @param street
	 * @param city
	 * @param state
	 * @param Email
	 * @param phone
	 * @param zip
	 */
	public AddressEntry( String firstName, String lastName, String street, String city, String state,
			String Email, String phone, int zip){
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.Email = Email;
		this.phone = phone;
	}

	/**
	 * default constructor.
	 */
	public AddressEntry(){};
	
	public void setFirstName(String name){
		this.firstName = name;
	}
	public void setlastName(String ln){
		this.lastName = ln;
	}
	public void setstreet(String st){
		this.street = st;
	}
	public void setcity(String ct){
		this.city = ct;
	}
	public void setstate(String sta){
		this.city = sta;
	}
	public void setEmail(String em){
		this.Email = em;
	}
	public void setphone(String ph){
		this.phone = ph;
	}
	public void setzip(int zip){
		this.zip = zip;
	}
	// getters
	String getfirstName(){
		return firstName;
	}
	String getlastName(){
		return lastName;
	}
	String getstreet(){
		return street;
	}
	String getcity(){
		return city;
	}
	String getstate(){
		return state;
	}
	String getEmail(){
		return Email;
	}
	String getphone(){
		return phone;
	}
	int getzip(){
		return zip;
	}
	
	/** returns a nicely formatted string that contains all the members of AddressEntry **/
	public String toString()
	{
		String formattedString = "\nfirst name: " + firstName + "\nlast name: " + lastName + "\nStreet: "
			+ street + "\ncity: "	+ city + "\nstate: " + state + "\nzip: " + zip
			+ "\nEmail: " + Email + "\nphone: " + phone;
		return formattedString;
	};

}
