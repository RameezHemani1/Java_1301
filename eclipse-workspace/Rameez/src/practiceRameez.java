import java.util.*;
public class practiceRameez {

	public static void main(String[] args) {
		
		Scanner console= new Scanner(System.in);
		
		System.out.print("Type in a name: ");
		String name = console.nextLine();
		name = name.toLowerCase();
		String lastName = name.substring(name.indexOf(" ")+1);
		String firstName = name.substring(0, name.indexOf(" "));
		System.out.println("Your name in reverse is: " + lastName + ", " + firstName);
	}

}
