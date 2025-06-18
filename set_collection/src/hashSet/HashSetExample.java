package hashSet;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet<String> ids=new HashSet<>();
			ids.add("EW01");
			ids.add("EW02");
			ids.add("EW01"); //Set not accept duplicates
			
			System.out.println("emp ID: "+ids);

	}

}
