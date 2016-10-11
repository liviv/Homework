package Week_1;

import java.util.Scanner;

/*4.2. ѕользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
package Week_1;*/

public class Week1_4_2_new {

	public static void main(String[] args) {
		System.out.println("Enter a number");	
		Scanner sc = new Scanner (System.in);
		int number1 = sc.nextInt(); 
		System.out.println("Enter a number");	
		int number2 = sc.nextInt();
		System.out.println("Enter a number");	
		int number3 = sc.nextInt();
		
		if (number1>number2 & number1>number3){
			System.out.println(number1);
			}
		else if (number2>number3 && number2>number1){
			System.out.println(number2);
			}
		else {
			System.out.println(number3);
			}
				System.out.println("It was the biggest number");
				
				if (number1<number2 && number1<number3){
					System.out.println(number1);
					}
				else if (number2<number3 & number2<number1){
					System.out.println(number2);
					}
				else {
					System.out.println(number3);
					}
						System.out.println("It was the SMALLEST number");		
	}
		
}
