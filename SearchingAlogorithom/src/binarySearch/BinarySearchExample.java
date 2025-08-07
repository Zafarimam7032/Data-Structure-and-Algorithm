package binarySearch;

public class BinarySearchExample {
	
	public static void main(String[] args) {
		int [] arr= {12,23,25,30,50,70,80,88,99};
		//50,70,80,88,99
		
		int left=0;
		int right=arr.length;
		
		int target=70;
		
		while(left<right) {
			
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("element foud");
				break;
			}
			else if(arr[mid]>target) {
				right=mid;
			}else {
				left=mid;
			}
		}
	}

}
/*
 Time Complexity of Binary Search
 | Case | Time Complexity | 
| Best Case | O(1) | 
| Worst Case | O(log n) | 
| Average Case | O(log n) | 

- 

 */
