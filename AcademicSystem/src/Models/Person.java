package Models;

public abstract class Person {
	private String Name;
	private int Age;
	private String Registration;
	private String Email;
	
	public Person(String Name, int Age, String Registration, String Email) {
		this.Name = Name;
		this.Age = Age;
		this.Registration = Registration;
		this.Email = Email;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getRegistration() {
		return Registration;
	}

	public void setRegistration(String registration) {
		Registration = registration;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName() {
		return Name;
	}
	
}
