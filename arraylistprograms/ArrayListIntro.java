package arraylistprograms;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//ArrayList - resizeable (dynamic) array that can grow or shrink automatically when we add or remove items in an array
		
		
		ArrayList <Integer> list = new ArrayList<>();
		
		//We can add items to the list using add method
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//to print the list
		System.out.println("Elements present in the list:"+list);
		
		//to find the number of elements present in the list
		
		System.out.println("Size of the list:"+list.size());
		
		//to find the particular element present in the given index
		
		System.out.println("Element in the given index:"+list.get(0));
		
		
		//If we want to update the list
		
		System.out.println(list.set(4, 100));
		
		System.out.println("Updated list:"+list);
		
		//To check if an element in the present in the list or not
		
		
		System.out.println(list.contains(100));
		

	}

}
