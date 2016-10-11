//не работает, если второе число больше, чем первое

package Week_1;

import java.util.Scanner;


public class Week1_4_7 {

	public static void main(String[] args) {
	
		Scanner slave = new Scanner (System.in);
		System.out.println("Insert first number");
		int number1 = slave.nextInt();
		System.out.println("Insert second number");
		int number2 = slave.nextInt();
		
		if (number1  %number2 == 0) {System.out.println("true " + (int)(number1 / number2));}
		else {System.out.println("false ");
		System.out.println ((number1 / number2) +" i ostatok " + (number1  %number2)) ;}
		
	}

}
