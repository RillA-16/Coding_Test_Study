package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Silver_1181 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String arrTemp[] = new String[n];

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			arrTemp[i] = sc.nextLine();
		}

		Arrays.sort(arrTemp, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(arrTemp[0]);

		for (int i = 1; i < n; i++) {
			if (!arrTemp[i].equals(arrTemp[i - 1])) {
				System.out.println(arrTemp[i]);
			}
		}
	}
}
