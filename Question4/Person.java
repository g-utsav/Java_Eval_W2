package Question4;

public class Person {

	String name;
	String gender;
	Address address;
	
	public Person(String name, String gender, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
}
