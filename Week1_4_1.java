/*Пользователь вводит параметр с консоли (текущий час от 0 до 24)
				Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

package Week_1;

import java.util.Scanner;

public class Week1_4_1 {

	public static void main(String[] args) {

		System.out.println("what time is it?");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		if (hour >= 0 & hour < 9) {
			System.out.println("Я отдыхаю ");
		} else if (hour >= 9 & hour <= 18) {
			System.out.println("Я на работе");
		} else {
			System.out.println("Я отдыхаю");
		}
	}
}
