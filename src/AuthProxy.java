
public class AuthProxy implements AuthInterface{
	private static AuthInterface authObj;
	private String loginInput;
	private String passwdInput;
	public AuthProxy(String loginInput, String passwdInput) {
		this.loginInput=loginInput;
		this.passwdInput=passwdInput;
		AuthCheck();
	}
	@Override
	public void AuthCheck() {
		setAuthObj(new Auth(loginInput, passwdInput));
	}
	public static AuthInterface getAuthObj() {
		return authObj;
	}
	public static void setAuthObj(AuthInterface authObj) {
		AuthProxy.authObj = authObj;
	}
}
