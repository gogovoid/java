package kr.ac.inha.cse.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

public class GenericTest {
	public static void main(String[] args) {
		Map<String, String> subjects = new Hashtable<String, String>();
		
		subjects.put("pl", "±Ë¿Œ«œ");
		subjects.put("oop2", "¿Ã¿Œ«œ");
		subjects.put("statistics", "√÷¿Œ«œ");
		
		List<String> keys = new ArrayList<String>(subjects.keySet());
		Collections.sort(keys);
		
		for(String key : keys) {
			System.out.println(key);
			System.out.println(subjects.get(key));
		}
		
//		TreeSet<String> scores = new TreeSet<String>();
//		
//		scores.add(new String("π⁄"));
//		scores.add("±Ë");
//		scores.add("√÷");
//		scores.add("¿Ã");
//		scores.add("»´");
//		scores.add("∞°");
//		
//		for(String score : scores) {
//			System.out.print(score + " ");					
//		}
//		System.out.println();
//		NavigableSet<String> descendingSet = scores.descendingSet();	
//		for(String score : descendingSet) {
//			System.out.print(score + " ");			
//		}
		
		
//		TreeSet<Integer> scores = new TreeSet<Integer>();
//		
//		scores.add(new Integer(66));
//		scores.add(22);
//		scores.add(0);
//		scores.add(33);
//		scores.add(88);
//		scores.add(11);
//		
//		for(Integer score : scores) {
//			System.out.print(score + " ");					
//		}
//		System.out.println();
//		NavigableSet<Integer> descendingSet = scores.descendingSet();	
//		for(Integer score : descendingSet) {
//			System.out.print(score + " ");			
//		}
		
//		List list = new ArrayList();
//		list.add("hello");
//		list.add("æ»≥Á");
//		list.add(1043215678);
//		String s = (String)list.get(2);
//		System.out.println(s);
		
		
//		List<String> list = new ArrayList<String>();
//		list.add("hello");
//		list.add("æ»≥Á");
//		//list.add(1043215678);
//		String s = list.get(0);   // no cast
//		System.out.println(s);	 	
	}

}
