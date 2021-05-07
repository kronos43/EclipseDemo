package homework5.business.concretes;

import homework5.business.abstracts.AutherationService;
import homework5.business.abstracts.UserService;
import homework5.core.absracts.LoginWGmailService;
import homework5.entities.concretes.User;

public class AutherationManager implements AutherationService{
	private UserService userService;
	private LoginWGmailService loginWGmailService;
	
	public AutherationManager(UserService userService, LoginWGmailService loginWGmailService) {
		super();
		this.userService = userService;
		this.loginWGmailService = loginWGmailService;
	}

	@Override
	public boolean login(User user) {
		User userToCheck = this.userService.getByMail(user.getEmail());
		if(userToCheck == null) {
			System.out.println("Kayitli kullanici bulunamadi.");
			return false;
		}
		else if(!user.getPassword().equals(userToCheck.getPassword())) {
			System.out.println("Parolaniz yanlis.");
			return false;
		}
		
			System.out.println("Giris basarili!");
			return true;
	}

	@Override
	public boolean register(User user) {
		if(!(this.userService.checkIfMailCorrect(user.getEmail()) && this.userService.getByMail(user.getEmail()) == null 
				&& user.getName().length() <= 2 && user.getLastName().length() <= 2 && user.getPassword().length() <= 6)){
			System.out.println("Kaydiniz belirtilen sebeplerle uyusmadigi icin basarisiz.");
			return false;
		}
			System.out.println("Kaydiniz basariyle tamamlanmistir.");
			return true;
	}

	@Override
	public boolean loginWGoogle(User user) {
		if(!loginWGmailService.login(user.getEmail(), user.getPassword())) {
			System.out.println("Google hesabinizin bilgileri girdiklerinizle uyusmuyor.");
			return false;
		}
		else if(this.userService.getByMail(user.getEmail())==null) {
			this.userService.add(user);
		}
		System.out.println("Giris kabul edildi");
		return true;
	}

}
