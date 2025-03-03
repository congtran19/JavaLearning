package Java1;

import java.util.Scanner;

public class lab03 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Xin moi nhap so can kiem tra: ");

		int n = scanner.nextInt();
		int i = 2;
		int count = 0;
		do {
			if (n % i == 0) {
				System.out.println("0 La so nguyen to");
				System.exit(0);
			}
			i++;
		} while (i < n);
		System.out.println("DAY LA SO NGUYEN TO");
	}
}
