package homework5.entities.concretes;

import homework5.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private boolean isItVerified;
	
	public User(){}

    public User(String mail,String password){
        this.email = mail;
        this.password = password;
    }
    
	public User(int id, String name, String lastName, String email, String password) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isItVerified() {
		return isItVerified;
	}
	
	public void setIsItVerified(boolean isItVerified) {
		isItVerified = isItVerified;
	}
	


}
