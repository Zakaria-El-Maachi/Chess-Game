package abstractClasses;

public abstract class Account {
	
	private String username;
	private String password;
	private int age;
	private String gender;
	private String country;
	private String email;
	
	public Account(String username, String password, int age, String gender, String country, String email) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.country = country;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
