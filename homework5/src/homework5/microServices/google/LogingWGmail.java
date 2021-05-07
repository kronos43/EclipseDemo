package homework5.microServices.google;

import java.util.*;

public class LogingWGmail {
	
	static List<Gmail> gmails;
	
	public LogingWGmail() {
		gmails = new ArrayList<>();
		gmails.add(new Gmail("Bilgehan","Buyukakyuz","test@gmail.com","12345671234"));
	}
	
	public Gmail find(String mail) {
		Gmail gmailToReturn = this.gmails.stream().filter((user)-> user.getMail().equals(mail)).findFirst().orElse(null);
		return gmailToReturn;
	}
	
	public boolean login(String mail,String password) {
		if(find(mail)!= null && find(mail).getPassword().equals(password)){
			return true;
		}
		return false;
		
	}
	
	
	
}
