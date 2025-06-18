package queue;

import java.util.*;

public class PrintQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> printJobs = new LinkedList<>();
		printJobs.offer("Invoice.pdf");
		printJobs.offer("Report.docx");
		printJobs.offer("Photo.jpg");

		System.out.println("Printing documents:");
		while (!printJobs.isEmpty()) {
			System.out.println("Printing: " + printJobs.poll());
		} 
	}

}
