package map;
import java.util.*;

public class SortedProductMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer,String> productMap = new TreeMap<>();
		productMap.put(200,"Mouse");
		productMap.put(100,"Keyboard");
		productMap.put(300,"Monitor");

		System.out.println("Sorted Product Map:"+ productMap);
		
	}

}
