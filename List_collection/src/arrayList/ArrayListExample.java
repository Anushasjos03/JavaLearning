package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> songs = new ArrayList<>();
		songs.add("Song A");
		songs.add("Song B");
		songs.add("Song C");

		System.out.println("Second Song: " + songs.get(1));

	}

}
