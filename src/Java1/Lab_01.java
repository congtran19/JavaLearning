package Java1;

import java.util.Scanner;

public class Lab_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ban oi hay nhap ten giao vien: ");
		String ten = scanner.nextLine();
		System.out.print("Hay Nhap Tuoi Giao vien: ");
		int tuoi = scanner.nextInt();
		System.out.print(ten + "da song " + tuoi + "nam");

	}

}
