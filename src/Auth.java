
public class Auth implements AuthInterface{
	//final String = 
	private String loginInput;
	private String passwdInput;
	final String login= "Admin";
	String password= "admin";
	private boolean isAuthed = false; 
	
	Auth(String loginInput, String passwdInput)
	{
		this.loginInput=loginInput;
		this.passwdInput=passwdInput;
		AuthCheck();
	}
	
	public void AuthCheck()
	{
		
		if(loginInput.equals(login) && passwdInput.equals(passwdInput)) {
			setAuthed(true);
			DisplayWelcome();
		}else {
			DisplayWrongAuth();
		}
		
	}
	private void DisplayWelcome()
	{
		System.out.println("You have been Authorised.");
		System.out.println("Welcome " + loginInput);
		//Do something ... 

		
	}
	private void DisplayWrongAuth() {
		System.out.println("Sorry it seems like your login or password is wrong");
	}

	public boolean isAuthed() {
		return isAuthed;
	}

	public void setAuthed(boolean isAuthed) {
		this.isAuthed = isAuthed;
	}

	
}
