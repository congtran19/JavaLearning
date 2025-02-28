package Java1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		int a = 6;
		int b = 9;
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		System.out.print("max = " + c);
		System.out.print("In put the fist number");
		int firstNumber = scanner.nextInt();
		System.out.print("In put the second number");
		int SecondNumber = scanner.nextInt();
		int e = Math.min(firstNumber, SecondNumber);

	}

}
