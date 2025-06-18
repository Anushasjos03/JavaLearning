package PrintQueueinOffice;
import java.util.Queue;
import java.util.LinkedList;
public class PrintQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> printJobs = new LinkedList<>();
		 // Adding print jobs to the queue
		 printJobs.add("Document1.pdf");
		 printJobs.add("Image2.png");
		 printJobs.add("Report3.docx");
		 System.out.println("Pending print jobs:");
		 for (String job : printJobs) {
		 System.out.println(job);
		 }
	}

}
