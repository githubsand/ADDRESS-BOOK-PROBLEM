
/**
 * @author Sandeep_Singh 
 * functionality print Welcome Message
 *
 */
public class AddressBook{

private static void addContact()
		String zipCode = inp.nextLine();
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		Address personAddress = new Address(city,state,zipCode,email);
		Person details = new Person(firstName, lastName, phoneNum, personAddress);
		Person details = new Person(firstName, lastName, phoneNum, city,  state, zipCode, email);
		System.out.println(details.toString());
		contacts.add(details);
	}	
	private static void edit() 
	{
		Scanner inp = new Scanner(System.in); 
		System.out.println("Enter firstname to update details");
		String name = inp.nextLine();
		for (Person person : contacts) 
		{
			if (name.equals(person.getFirstName())) 
			{
				Scanner newInput = new Scanner(System.in);
				System.out.println("Enter the LastName:");
				String lastName = newInput.nextLine();
				System.out.println("Enter the phone:");
				String phoneNum = newInput.nextLine();
				System.out.println("\nAddress:");
				System.out.println("Enter the city:");
				String city = newInput.nextLine();
				System.out.println("Enter the state:");
				String state = newInput.nextLine();
				System.out.println("Enter the zipcode:");
				String zipCode = newInput.nextLine();
				System.out.println("Enter the email-id:");
				String email = newInput.nextLine();
				person.setLastName(lastName);
				person.setphoneNumber(phoneNum);
				person.setCity(city);
				person.setState(state);
				person.setZipCode(zipCode);
				person.setEmail(email);
			}
		}	
	}
	private static void display() 
	{
		for (Person person : contacts) {
			System.out.println("Address Book:\n"
					+ "1) Add Person\n"
					+ "2) Display\n"
					+ "3) Edit\n"
					+ "0) Close");
			Scanner inp = new Scanner(System.in);
			Scanner option = new Scanner(System.in);
			System.out.println("Select an option:");
			int num=inp.nextInt();
			int num=option.nextInt();
			switch (num) 
			{
			case 1:
 public static void main(String[] args)
			case 2:
				display();
				break;
			case 3:
				edit();
				break;
			case 0:
				cond=0;
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}
	}
}
	
}
