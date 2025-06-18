package conditionalstatements;

import java.util.Scanner;
 
public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("Enter principal: ");
		 float principal = sc.nextFloat();
		
		System.out.println("Enter rate: ");
		float rate = sc.nextFloat();
		
		System.out.println("Enter time: ");
		float time = sc.nextFloat();

		
		if(principal>0 && rate>0 && time >0) {
			double simpleinterest=(principal * time * rate) / 100;
			System.out.printf("Simple Interest:%.2f ", simpleinterest);
		}
		else
		{
			System.out.println("enter a valid amount");
		}
	}

}
