import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String loginInput = null;
		String passwdInput = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("#################################");
		System.out.println("#       For Testing Purpose     #");
		System.out.println("#Login: Admin                   #");
		System.out.println("#Password: admin                #");
		System.out.println("#                               #");
		System.out.println("#################################");
		System.out.println("");
		System.out.println("Please enter the Login: ");
		loginInput = userInput.nextLine();
		System.out.println("Please enter the Password: ");
		passwdInput = userInput.nextLine();
		AuthInterface authObj = new AuthProxy(loginInput, passwdInput);

		userInput.close();
	}

}
