package Hashtable;

import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> login = new Hashtable<>();
		login.put("Admin", "1234");
		login.put("user", "abcd");

		System.out.println("admin password:" + login.get("admin"));
	}

}
