//4.3. ������������ ������ �����. ������� �� ����� ��� ��������� ��������, ���� ����� ������� �� 7 ������.

package Week_1;

import java.util.Scanner;

public class Week1_4_3 {

	public static void main(String[] args) {
		Scanner slave = new Scanner (System.in);

		System.out.println("Enter a number");
		int number = slave.nextInt();
		if (number%7 == 0){System.out.println(number*2);
				}
	}

}
