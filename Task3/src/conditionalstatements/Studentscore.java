package conditionalstatements;
import java.util.Scanner;
public class Studentscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj3 = new Scanner(System.in);

		System.out.println(" student score");
		int score = obj3.nextInt();
		
if(score>=0 && score<=100) {
		if (score>=40) {
			System.out.println("pass");
		}
	
		else {
			System.out.println("fail");
		}}

else {
	System.out.println("invalid");
}
	}

}
