package homework5.dataAccess.concretes.InMemory;

import java.util.List;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class InMemoryDao implements UserDao{
	private List<User> users;
	private static int lastId;
	
	public InMemoryDao() {
		this.users = users;
		lastId = 0;

	}
	
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Sisteme basariyla kaydoldunuz." + user.getEmail() + "/"+ user.getName());
		lastId++;
	}

	@Override
	public void login(User user) {
		
		System.out.println("Giris basarili." + user.getEmail() + "/"+ user.getName());
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Sistemimizden kaydinizi basariyla sildiniz. Sizi tekrar gormek isteriz" + user.getName());
		
	}

	@Override
	public User registerByMail(String mail) {
		for (User user : users) {
			if(user.getEmail().equals(mail));
			return user;
		}
		return null;
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}


	@Override
	public User getByMail(String email) {
		User userToReturn = null;
		for (User user : users) {
			if(user.getEmail().equals(email)) {
				userToReturn = user;
				break;
			}
		}
		return userToReturn;
			
	}

	@Override
	public boolean isItVerified(User user) {
		  User userToCheck = get(user.getId());
	        return userToCheck.isItVerified() ? true : false;
	}

	@Override
	public User get(int id) {
		User userToReturn =null;
		for (User user : this.users) {
			if(user.getId() == id) {
				userToReturn = user;
				break;
			}
		}
		return userToReturn;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static int getLastId() {
		return lastId;
	}

	public static void setLastId(int lastId) {
		 InMemoryDao.lastId = lastId;
	}

}
