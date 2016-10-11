package Week_1;

import java.util.Scanner;

public class Week1_4_5 {

	public static void main(String[] args) {
		Scanner slave = new Scanner (System.in);
		System.out.println("Insert first number");
		int number1 = slave.nextInt();
		System.out.println("Insert second number");
		int number2 = slave.nextInt();
		if (number1 > number2) {System.out.println("difference is " + (number1 - number2));}
		if (number2 > number1) {System.out.println("Sum is " + (number1 + number2));}
		}
	}
	