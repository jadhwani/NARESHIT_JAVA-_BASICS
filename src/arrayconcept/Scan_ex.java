package arrayconcept;

import java.util.Scanner;

public class Scan_ex {
	public static void main(String[] args1) {
		int a,b,c;
		System.out.println("enter a and  b values ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("addition "+c);
		}


}
