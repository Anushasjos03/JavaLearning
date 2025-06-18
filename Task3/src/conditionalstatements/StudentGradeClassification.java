package conditionalstatements;

import java.util.Scanner;

public class StudentGradeClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

		System.out.println(" student score");
		int score = obj.nextInt();

		if (score >= 90) {
			System.out.println("excellent");
		} else if (score >= 70 && score <= 89) {
			if (score >= 80) {
				System.out.println("very good");
			}
			else {
				System.out.println("good");
			}
		}
		else {
			if(score <=70) {}
			System.out.println("Needs Improvement");
		}
	}

}
