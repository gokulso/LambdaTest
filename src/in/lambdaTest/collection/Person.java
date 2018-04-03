package in.lambdaTest.collection;

public class Person {
	
	private String firstName;
	private String lirstName;
	private int age;
	
	
	public Person(String firstName, String lirstName, int age) {
		super();
		this.firstName = firstName;
		this.lirstName = lirstName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLirstName() {
		return lirstName;
	}


	public void setLirstName(String lirstName) {
		this.lirstName = lirstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lirstName=" + lirstName + ", age=" + age + "]";
	}
	
	

}
