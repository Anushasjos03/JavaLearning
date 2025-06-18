package List;

import java.util.*;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> students = new ArrayList<>();
		students.add("Amit");
		students.add("Neha");
		students.add("Rahul");

		System.out.println("Student Names:");
		for (String name : students) {
			System.out.println(name);
		}
	}

}
