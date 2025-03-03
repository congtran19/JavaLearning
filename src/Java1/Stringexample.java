package Java1;

import java.util.Arrays;

public class Stringexample {
	public static void main(String[] args)

	{
		String[] clubs = { "MU", "Mancity", "Liverpool" };
		clubs[0] = "Anh cong 19 tuoi";
		System.out.println(Arrays.toString(clubs));
		System.out.println(clubs.length);
		String[] a = new String[5];
		a[0] = "1";
		int[] b = new int[9];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		System.out.println(Arrays.toString(b));
		System.out.println(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
