package Java1;

import java.util.Scanner;

public class ifelse {
	public static void main(String args[]) {
		System.out.print("Nhap so diem ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score <= 5) {
			score++;
			System.out.println(score);
			System.out.print("da truot mon nhung ma duoc nang 1 diem");
		} else {
			System.out.print("ban da qua mon voi " + score + " diem");
		}
		scanner.close();
		switch_key(score);

	}

	public static void switch_key(int score) {
		switch (score) {
		case 1:
			System.out.print("ban deo qua mon");
			break;
		case 2:
			System.out.print("Ban cung deo qua mon");
			break;
		default:
			System.out.print("BAN CUNG DEO qua mon ");
			System.exit(score);
		}

	}

}
