package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr= {1,23,2,32,20,50,45};
		
		for(int i=1;i<arr.length;i++) {
			
			int j=i-1;
			int key=arr[i];
			while(arr[j]>key) {
			
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));

		}
		
		System.out.println(Arrays.toString(arr));
	}

}
