package cen4025;

import java.util.LinkedList;
import java.util.Random;

//adds 2 million random numbers to a LinkedList and then deletes all numbers
public class LLTest {
	
	public static void LLTest() {
		
		int listSize = 2000000;
		LinkedList<Integer> ll = new LinkedList<>();
		Random rand = new Random();
		int randomNum;
		
		// add random numbers
		for(int i = 0; i < listSize; ++i) {
			randomNum = rand.nextInt(200);
			ll.add(randomNum);
		}
		
		// delete all elements
		ll.removeAll(ll);
	}
}
