package mail;

import javax.mail.*;

public class NaverAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public NaverAuthentication() {
		passAuth = new PasswordAuthentication("tooyoon505", "tkfkdgoD1535@@");
	}
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
