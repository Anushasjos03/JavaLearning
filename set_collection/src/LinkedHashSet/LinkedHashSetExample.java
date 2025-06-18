package LinkedHashSet;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedHashSet<String> guests=new LinkedHashSet<>();
	guests.add("Alice");
	guests.add("Bob");
	guests.add("Alice"); // duplicates
	
	System.out.println("guest list : "+guests);//alice,bob

	}

}
