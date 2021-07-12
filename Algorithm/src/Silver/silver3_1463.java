package Silver;
import java.util.Scanner;

public class silver3_1463 {

	static Integer[] temp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		temp = new Integer[n + 1];
		sc.close();

		// ��� Ż���ų���� ����,,?
		temp[0] = temp[1] = 0;

		System.out.print(calculate(n));
	}

	public static int calculate(int n) {

		// �ѹ��� ��� ���� �迭�� ��
		if (temp[n] == null) {
			// n�� 6�� ����� ��
			if (n % 6 == 0) {
				temp[n] = Math.min(calculate(n - 2), Math.min(calculate(n / 3), calculate(n / 2))) + 1;
			} else if (n % 3 == 0) { // 3�� ����� ��
				temp[n] = Math.min(calculate(n / 3), calculate(n - 1)) + 1;
			} else if (n % 2 == 0) { // 2�� ����� ��
				temp[n] = Math.min(calculate(n / 2), calculate(n - 1)) + 1;
			} else { // 2�� 3�� ����� �ƴ� ��
				temp[n] = calculate(n - 1) + 1;
			}
		}
		return temp[n];
	}
}