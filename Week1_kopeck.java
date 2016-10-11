package Week_1;

import java.util.Scanner;

public class Week1_kopeck {
public static void main (String []args ){

	Scanner slave = new Scanner(System.in);
	System.out.println("Enter your number");
	 int num = slave.nextInt();
	 if (num <=0)
	 { System.out.print("Error");}
	 else if (num >100)  { System.out.print( num + "- ýòî ãðèâíà!");}
	 else if (num%10 == 1)
	 { System.out.print( num + " êîïåéêà");}
	 else if (num %10==2 || num %10==4  >=2)
	 { System.out.print( num + " êîïåéêè");}
	 else { System.out.print( num + " êîïååê");}
	 //if (num >=5 & num <=20| num >= 25 & num <= 30| num >=35 & num <= 40|num >= 44 & num <=50|num >=55 & num<=60|num >=65 & num <=70|
		//	 num >=75 & num <=80|num >= 85 & num <=90|num >= 95 &  num <=100)
	 
	 
	 
}

}
