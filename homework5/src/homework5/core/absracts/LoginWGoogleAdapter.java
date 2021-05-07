package homework5.core.absracts;

import homework5.microServices.google.LogingWGmail;

public class LoginWGoogleAdapter implements LoginWGmailService{

	@Override
	public boolean login(String mail, String password) {
		LogingWGmail logwgoogle = new LogingWGmail();
		logwgoogle.login(mail, password);
		
		return false;
	}
	
}
