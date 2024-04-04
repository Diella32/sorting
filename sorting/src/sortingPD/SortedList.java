package sortingPD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Random;

public class SortedList<K extends Comparable<K>> extends ArrayList<K> {
	
	
	

	/*private class sortedList<K> extends ArrayList<K,E> {
	
		K key; 
		int size;
		E element; 
		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		private sortedList(K keyUsed){
			key = keyUsed;
			 
		}
		
		public void setKey(K keyUsed) {
			key = keyUsed; 
		}
		
		public K getKey() {
			return key; 
		}
		public void setSize(int sizeUsed) {
			size = sizeUsed; 
		}
		public int getSize() {
			return size; 
		}

	}*/


	int totalSize = 0;
	public SortedList() {
		
	}
	public SortedList(int x) { 
		totalSize = x;
	
		//super(x);
	}
	
	public void merge(ArrayList<K> groupOne, ArrayList<K> groupTwo) {
		
		int size = this.size();
		ArrayList<K>[] list = new SortedList[this.size()];
		
		int i = 0;
		int j = 0;
		while((i+j)< size) {
			if(j == groupTwo.size()|| (i < groupOne.size() && groupOne.get(i).compareTo(groupOne.get(i+1)) < 0)) {
				this.add(groupOne.get(i)); 
			}
			else 
				this.add(groupTwo.get(i)); 
		}
	int p = 0;	
	}
	
	public void mergeSort () {
		mergeSortFunction(this);
	}
	
	private void  mergeSortFunction(SortedList<K> list) {
		// divise en deux and conquer
		SortedList<K> groupOne = new SortedList<K>();
		SortedList<K> groupTwo = new SortedList<K>();
		int size = list.size();
		if (size< 2) {
			return; 
		}
		else {
		int mid = size/2;
		for (int i = 0; i<mid; i++) {
			  groupOne.add(list.get(i)); 
			  
		}
		
		for (int i = mid; i<size; i++) {
			 groupTwo.add(list.get(i));  
			 
		}
		
		mergeSortFunction(groupOne); 
		//this.addAll(groupOne, groupTwo); 	
		merge(groupOne, groupTwo);
		}
	}
	
	public ArrayList<K> quickSort(SortedList<K> arrayUsed){
		// pivot and divide and conquer
		int size = arrayUsed.size();
		if (size < 2) {
			return arrayUsed; 
		}
		
		SortedList<K> smallerElements = new SortedList<K>();
		SortedList<K> greaterElements = new SortedList<K>();
		SortedList<K> equalElement = new SortedList<K>();
		
		Random generator = new Random();
		
		int pivot = generator.nextInt(size);
		
		K pivotElement =  arrayUsed.get(pivot); 
		
		arrayUsed.remove(pivot); 
		
		//iterate through all values of passed sortedlist

		while (!arrayUsed.isEmpty()) {
			K y = arrayUsed.get(arrayUsed.size() - 1);
			if(y.compareTo(pivotElement) < 0) {
				smallerElements.add(y);
			}
			else if(y.compareTo(pivotElement) > 0) {
				greaterElements.add(y);
			}
			else
				equalElement.add(y);
			arrayUsed.remove(arrayUsed.size() - 1);
		}
		//recursively call quicksort algorithm on smaller and greater arraylists
		
		 quickSort(smallerElements); 
		 quickSort(greaterElements); 

		
		//add all values back into passed array
		 arrayUsed.addAll(smallerElements); 
		 arrayUsed.addAll(equalElement);
		 arrayUsed.addAll(greaterElements); 
		 
		
		//return equalElement;

		return arrayUsed;
	}

	void exampleMerge (ArrayList<K> list, ArrayList<K> list2) {
		int index = 3;
		if (list.get(index).compareTo(list.get(index + 1)) < 0 ) {
			// do stuff
		}
		this.add(list2.get(index));
	}
	
	
		
		public void selectionSort(ArrayList<K> list){
			
			int size = this.size();
			
			for (int i = 0; i<(size-1); i++) {
				int smallIndex = i;
				for(int j = (i+1); j<size; j++) {
					
					if(list.get(j).compareTo(this.get(smallIndex)) < 0) {
						smallIndex = j;
					}
					
				}
				
				K temporary = this.get(i); // exchange the elements so they can be sorted 
				this.set(i, this.get(smallIndex)); 
				this.set(smallIndex, temporary); 
			
			}
			
			
		}
		public void InsertionSort(ArrayList<K> list){
			int size = this.size();
			
			for (int i = 1; i < size; i++) {
				K key = this.get(i); 
				int j = i-1; 
				while(j >=0 && list.get(j).compareTo(key)> 0) {
					this.set(j+1, this.get(j));
					j--; 
				}
				
				this.set(j+1, key); 
			}
					
		}
		
		
		
		
		
	
	
}
