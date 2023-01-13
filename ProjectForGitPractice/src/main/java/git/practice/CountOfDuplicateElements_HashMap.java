package git.practice;

import java.util.HashMap;

public class CountOfDuplicateElements_HashMap {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 5, 3, 4, 4, 5, 123, 5, 2, 5, 3 };
		
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		/*
		
		{
			1: 1,
			2: 1,
			2: 1+1,
			2: 1+1+1, = 3
			5: 1,
			5: 1+1,
			5: 1+1+1,
			5: 1+1+1+1, = 4
			3: 1,
			3: 1+1, = 2
			4: 1,
			4: 1+1, = 2
			123: 1,
		}
		
		*/
		
		for (int currentElement: arr) {
			if (freq.get(currentElement) == null) {
				freq.put(currentElement, 1);
			} else {
				freq.put(currentElement, freq.get(currentElement) + 1);
			}
		}
		
	//	System.out.println(freq.values().stream().filter(f->f>1).count());
	freq.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}
}
