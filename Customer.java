

public class Customer extends Object{
	
	private String name;
	private int age;
	
	public Customer(Customer c) {
		name = c.name;
		age = c.age;
	}
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + "\n" + age;
	}
}
