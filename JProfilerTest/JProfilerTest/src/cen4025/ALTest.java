package cen4025;

import java.util.ArrayList;
import java.util.Random;

// adds 2 million random numbers to an ArrayList and then deletes all numbers
public class ALTest {

	public static void ALTest() {
		
		int arraySize = 2000000;
		ArrayList<Integer> al = new ArrayList<Integer>(arraySize);
		Random rand = new Random();
		int randomNum;
		
		// add random numbers
		for(int i = 0; i < al.size(); ++i) {
			randomNum = rand.nextInt(200);
			al.add(randomNum);
		}
		
		// delete all elements
		al.clear();
	}
}

