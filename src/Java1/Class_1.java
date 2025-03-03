package Java1;

public class Class_1 {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Class_1 class1 = new Class_1();
		System.out.print(class1.sum(9, 8));
		Student_Class st1 = new Student_Class();
		st1.messenger();
		Student_Class st2 = new Student_Class("cong tran", 19);
		st2.messenger("congtran");

	}

}
