package Silver;

import java.util.Scanner;

public class silver_2579 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] sum = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// ��� 1���� ���
		sum[1] = arr[1];

		// ����� 2���� �� ����� ���� �� ����
		if (n >= 2) {
			sum[2] = arr[1] + arr[2];
		}

		// ��� 3�� ���� ���
		for (int t = 3; t <= n; t++) {
			sum[t] = Math.max(sum[t - 2], sum[t - 3] + arr[t - 1]) + arr[t];
		}
		System.out.println(sum[n]);
	}
}
