package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByMail(String mail);
	boolean checkIfMailCorrect(String mail);
	boolean isItveried(User user);
	void verify(User user);
}
