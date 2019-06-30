package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintOutput {

	public static void main(String[] args) {
		//Create a Collection Array with values {20,10, 40, 50, 70} 
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(70);
		System.out.println(list);
		//Print the Output as 10 20 40 50 70 
		Collections.sort(list);
		//Print the Output as 70 50 40 20 10
		Collections.reverse(list);
		System.out.println(list);

	}

}
