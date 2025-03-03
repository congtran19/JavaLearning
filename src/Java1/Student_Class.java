package Java1;

public class Student_Class {
	// class attributes
	String name;
	int age;

	public Student_Class() {

	}

	public Student_Class(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void messenger() {
		System.out.println("ta co yeu co ta");
	}

	public void messenger(String name) {
		System.out.println("ta co yeu co ta " + name);
	}

}
