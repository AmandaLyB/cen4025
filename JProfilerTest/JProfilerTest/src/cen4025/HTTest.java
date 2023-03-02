package cen4025;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

//adds 2 million random numbers to a Hashtable and then deletes all numbers
public class HTTest {
	
	public static void HTTest() {
		
		int listSize = 2000000;
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		Random rand = new Random();
		int randomNum;
		
		// add random numbers
		for(int i = 0; i < listSize; ++i) {
			randomNum = rand.nextInt(200);
			ht.put(i, randomNum);
		}
	
		// delete all elements
		ht.clear();
	}
}
