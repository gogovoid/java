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
		
		subjects.put("pl", "김인하");
		subjects.put("oop2", "이인하");
		subjects.put("statistics", "최인하");
		
		List<String> keys = new ArrayList<String>(subjects.keySet());
		Collections.sort(keys);
		
		for(String key : keys) {
			System.out.println(key);
			System.out.println(subjects.get(key));
		}	
	}

}
