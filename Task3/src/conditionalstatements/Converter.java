package conditionalstatements;
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Celsius");
		int Celsius =sc.nextInt();
		
		
		
		if (Celsius >= -273 )//must know the value of celsius
		{
		    double Fahrenheit= ((1.8 * Celsius)+32);
		    System.out.println("Fahrenheit"+Fahrenheit);
		    }
		
		else {
			
			System.out.println("enter valid inputs");
		}
		
		
	}

}
