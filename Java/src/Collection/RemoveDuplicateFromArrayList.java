package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays 
                .asList(10, 20, 10, 20, 20, 30, 30, 10, 30, 40, 50, 50));
		ArrayList<Integer> newlist = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		list.add(60);
//		list.add(30);
		System.out.println("New ArrayList is: " + list);
		for (int j : list) {
			if (!newlist.contains(j)) {
				newlist.add(j);
			}
		}
		System.out.println("Duplicates has been removed from Old List: " + newlist);
	}

}
