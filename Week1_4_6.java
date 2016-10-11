package Week_1;

import java.util.Scanner;

public class Week1_4_6 {

	public static void main(String[] args) {
		Scanner slave = new Scanner (System.in);
		System.out.println("Insert first number");
		int number1 = slave.nextInt();
		System.out.println("Insert second number");
		int number2 = slave.nextInt();
		int sum= number1 + number2;
		if (sum >=11 & sum <= 19){System.out.println (sum);
	}
		System.out.println("finish");	
	}
}