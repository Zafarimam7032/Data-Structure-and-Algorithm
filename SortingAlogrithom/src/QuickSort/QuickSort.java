package QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 12, 23, 43, 1, 45, 54, 2, 78, 10 };

		quicksort(arr, 0, arr.length - 1);

		System.out.println("after sorting : " + Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partion(arr, low, high);
			quicksort(arr, low, pi - 1);
			quicksort(arr, pi + 1, high);

		}
	}

	private static int partion(int[] arr, int low, int high) {
		int pivot = arr[high];
		int j = low - 1;
		for (int i = low; i < high; i++) {

			if(arr[i]<=pivot) {
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		int temp=arr[j+1];
		arr[j+1]=arr[high];
		arr[high]=temp;

		return j+1;
	}

}
