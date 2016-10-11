//Вводим число с плавающей точкой с консоли,
//и проверяем лежит ли оно в диапазоне от 0 до 1
package Week_1;

import java.util.Scanner;

public class Week1_4_4 {

	public static void main(String[] args) {
		for(;;){
		System.out.println("Insert number");
		System.out.println('\n');
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		if (number >=0 && number <=1){
			System.out.println("true");	
		}
		else {System.out.println("false");}
		}
		//double number1 = sc.nextDouble();
	}

}
