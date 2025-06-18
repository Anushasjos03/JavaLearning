package conditionalstatements;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter participant 1's score");
		int p1 = obj.nextInt();
		
		System.out.println("enter participant 2's score");
		int p2 = obj.nextInt();
		
		System.out.println("enter participant 3's score");
		int p3 = obj.nextInt();
		
		
		if (p1>=p2) {
			System.out.println("p1 is winner"+p1);
		}
		else if (p3>=p2){
			System.out.println("p3 is winner"+p3);
		}
		else {
			System.out.println("p2 is winner"+p2);
		}
	}

}
