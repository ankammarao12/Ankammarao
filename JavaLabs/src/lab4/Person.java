package lab4;

public class Person {
	
	private String name;
	private float age;
	
	Person() {}   // default constructor
	
	
	// person constructor

	public Person(String name, float age) { 
		super();
		this.name = name;
		this.age = age;
	}
	
	// generating getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	 //tostring method

	@Override
	public String toString() {     
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
