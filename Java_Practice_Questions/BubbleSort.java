
package com.mycompany.java_practice_questions;

public class BubbleSort {
  public static void main(String[] args) {
		
		int array[] =  {99897868, 1, 86766887, 288678, 7, 378878, 6, 4655576, 5};
		
		bubbleSort(array);
		
		for(int i : array) {
			System.out.print(i + ",");
		}
	}
	
	public static void bubbleSort(int array[]) {
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
