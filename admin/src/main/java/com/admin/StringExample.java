package com.admin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringExample {

	public static void main(String args[]) {
		String ex = "aaabbfbcccdeee";
		char a[] = ex.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : a) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}else {
				
				map.put(c, 1);
			}
		}
		Set<Character> s= map.keySet();
		Iterator<Character> itr = s.iterator();
		
		while (itr.hasNext()) {
			Character item = itr.next() ;
			if(map.get(item ) == 1){
				System.out.println("No Repeating Character>>>>"+item);
				break;
			}
		}
		
	}
}
