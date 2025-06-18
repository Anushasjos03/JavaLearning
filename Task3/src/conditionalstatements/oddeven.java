package conditionalstatements;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj1 = new Scanner(System.in);

		System.out.println("enter a number");
		int n1 = obj1.nextInt();
		
		if (n1%2==0) {
			System.out.println("even");
		}
		
		else  {
			System.out.println("odd");
		}
		
		

	}

}
