package main;

public class Person {
	private String Name;
	private int Age;
	private String JobTitle;

	public Person() {

	}

	public Person(String Name, int Age, String JobTitle) {
		this.Name = Name;
		this.Age = Age;
		this.JobTitle = JobTitle;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String JobTitle) {
		this.JobTitle = JobTitle;
	}

	public String method(String Name, int Age, String JobTitle) {
		String A = Integer.toString(Age);
		return (Name + A + JobTitle);
		
		
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", JobTitle=" + JobTitle + "]";
	}

}
