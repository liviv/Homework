/*������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
				���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")*/

package Week_1;

import java.util.Scanner;

public class Week1_4_1 {

	public static void main(String[] args) {

		System.out.println("what time is it?");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		if (hour >= 0 & hour < 9) {
			System.out.println("� ������� ");
		} else if (hour >= 9 & hour <= 18) {
			System.out.println("� �� ������");
		} else {
			System.out.println("� �������");
		}
	}
}
