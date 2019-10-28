package main;

public class Person {
	public int age;
	public String name;
	public int idNumber;
	public boolean registered;
	public String address;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person() {
	}

	public Person(int age, String name, int idNumber, boolean registered) {
		this.age = age;
		this.name = name;
		this.idNumber = idNumber;
		this.registered = registered;
	}

	public Person(int age, String name, int idNumber, String address, boolean registered) {
		this.age = age;
		this.name = name;
		this.idNumber = idNumber;
		this.address = address;
		this.registered = registered;
	}

	public Person(int age, String name, String address, boolean registered) {
		this.age = age;
		this.name = name;
		this.address = address;
		this.registered = registered;
	}

	public boolean isAccReg() {
		if (registered == true) {
			return true;
		} else
			return false;
	}

	public void registerAcc() {
		if (registered = true) {
			System.out.println(registered + "person is already registered");
		} else
			registered = true;
		System.out.println(registered + "account registered");
	}

	public void unRegisterAcc() {
		if (registered = false) {
			System.out.println(registered + "person is already not registered");
		} else
			registered = false;
		System.out.println(registered + "account unregistered");
	}

	public String updateName(String in) {
		this.setName(in);
		return this.getName();
	}

	public String updateID(String in) {
		this.setName(in);
		return this.getName();
	}
}