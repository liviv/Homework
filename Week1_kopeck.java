package Week_1;

import java.util.Scanner;

public class Week1_kopeck {
public static void main (String []args ){

	Scanner slave = new Scanner(System.in);
	System.out.println("Enter your number");
	 int num = slave.nextInt();
	 if (num <=0)
	 { System.out.print("Error");}
	 else if (num >100)  { System.out.print( num + "- это гривна!");}
	 else if (num == 1 | num == 21| num == 31| num == 41|num == 51|num == 61|num == 71|
			 num == 81|num == 91)
	 { System.out.print( num + " копейка");}
	 else if (num >=2 & num <=4| num >= 22 & num <= 24| num >=32 & num <= 34|num >= 42 & num <=44|num >=52 & num<=54|num >=62 & num <=64|
			 num >=72 & num <=74|num >= 82 & num <=84|num >= 92 &  num <=94)
	 { System.out.print( num + " копейки");}
	 else { System.out.print( num + " копеек");}
	 //if (num >=5 & num <=20| num >= 25 & num <= 30| num >=35 & num <= 40|num >= 44 & num <=50|num >=55 & num<=60|num >=65 & num <=70|
		//	 num >=75 & num <=80|num >= 85 & num <=90|num >= 95 &  num <=100)
	 
	 
	 
}

}
