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
	public void deleteItem(String item) {
		int count = 0;
		for(int i = 0; i < this.toDoList.size(); ++i) {
			if(item.contentEquals(this.toDoList.get(i))) {
				this.toDoList.remove(item);
				count ++;
			} 
		}
		if (count > 0) {
			System.out.println("Deleted \"" + item + "\" from list");
			count = 0;
		} else {
			System.out.println("Could not locate \"" + item + "\" in list");
			count = 0;
		}
		System.out.println("-------------------");
	}
	
	// print the to-do list to console
	public void viewList() {
		System.out.println("To Do List: ");
		for(int i = 0; i < this.toDoList.size(); ++i) {
			System.out.println("\t" + toDoList.get(i));
		}	
		System.out.println("-------------------");
	}
}

