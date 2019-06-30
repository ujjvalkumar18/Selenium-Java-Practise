package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {
		// Create a Collection Array with duplicate values {10, 20, 40, 10, 20, 30, 50} 
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		System.out.println(set);
		for(int temp:set){
			System.out.println(temp);			
		}
		List<Integer> list=new ArrayList<Integer>();
	}

}
