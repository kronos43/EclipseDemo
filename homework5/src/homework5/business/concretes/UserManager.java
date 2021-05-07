package homework5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import homework5.business.abstracts.UserService;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class UserManager implements UserService{
	
	private static final Pattern VALID_EMAIL_TYPE = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private UserDao dao;
	public UserManager(UserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void add(User user) {
		this.dao = dao;
		
	}

	@Override
	public void delete(User user) {
		if(!(getByMail(user.getEmail())!=null) && isItveried(user)) {
			System.out.println("Veri uyusmazligindan kullanici silinemiyor.");
			return;
		}
		this.dao.delete(user);
		System.out.println("Kullanici basariyla silindi.");
		
	}

	@Override
	public void update(User user) {
	}

	@Override
	public User getByMail(String mail) {
		User foundedUser = this.dao.getByMail(mail);
		return foundedUser;
	}

	@Override
	public boolean checkIfMailCorrect(String mail) {
		Matcher matcher = VALID_EMAIL_TYPE.matcher(mail);
		return matcher.find();
	}

	@Override
	public boolean isItveried(User user) {
		return this.dao.isItVerified(user);
	}

	@Override
	public void verify(User user) {
		user.setIsItVerified(true);
	}

}
