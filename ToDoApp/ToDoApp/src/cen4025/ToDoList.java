package cen4025;

import java.util.ArrayList;

public class ToDoList {
	private ArrayList<String> toDoList;
	
	// create array list object
	ToDoList() {
		this.toDoList = new ArrayList<String> ();
	}

	// add an item to the to-do list
	public void addItem(String item) {
		this.toDoList.add(item);
	}

	// delete an item from the to-do list
	public void deleteItem() {
		
	}
	
	// print the to-do list to console
	public void viewList() {
		for(int i = 0; i < this.toDoList.size(); ++i) {
			System.out.println("" + toDoList.get(i));
		}		
	}
}

