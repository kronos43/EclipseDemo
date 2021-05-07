package homework5.dataAccess.abstracts;

import java.util.List;

import homework5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void login(User user);
	void delete(User user);
	User registerByMail(String message);
	List<User> getAll();
	User getByMail(String email);
	boolean isItVerified(User user);
	User get(int id);
	
}
