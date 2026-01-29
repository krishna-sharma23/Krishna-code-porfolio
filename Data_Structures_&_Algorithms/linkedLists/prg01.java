package linkedLists;

import java.util.*;

public class prg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		int middle = findMiddle(list);
		System.out.println(list);
		System.out.println(middle);
	}

	private static int findMiddle(LinkedList<Integer> list) {
		int slow = 0, fast = 0;
		while(fast < list.size()) {
			slow++;
			fast += 2;
		}
		
		return list.get(slow);
	}

}
