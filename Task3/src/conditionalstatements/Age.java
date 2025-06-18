package conditionalstatements;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

		System.out.println("enter person's age");
		int person = obj.nextInt();
	
		
		if (person<13) {
			System.out.println("Child");
		}
		else if (person<=13 && person<=19 ){
			System.out.println("teen");
		}
		else {
			System.out.println("older");
		}
		
	}

}
