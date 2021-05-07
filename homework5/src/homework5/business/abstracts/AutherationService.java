package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface AutherationService {
	boolean login(User user);
	boolean register(User user);
	boolean loginWGoogle(User user);
	
}
