package Hashing;


import java.util.*;

public class prg01 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		//adding elements
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		
		//removing element
		set.remove(2);
		System.out.println(set);
		
		//checking the presence of element
		System.out.println(set.contains(3));
		System.out.println(set.contains(2));
		
		//iterating over sets using an iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) System.out.println(it.next());
		
	}

}
