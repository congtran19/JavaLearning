package Java1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a = 6;
		int b = 9;
		int c = a + b;
		System.out.println("Sum" + c);
		System.out.print("Hoi dan it");
		System.out.print("\nHoi dan it");

		System.out.printf("Co %.3f nguoi dang ki ", 4000.55);

		System.out.printf("Co %.0f nguoi dang ki ", 4000.55);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your age is: ");
		int age = scanner.nextInt();
		System.out.println("My name is " + name + ", age = " + age);
		scanner.close();

	}

}
