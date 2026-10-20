package Search;

import java.util.Arrays;

//Linear Data Structures - Arrays/List, Linked List, Stacks, Queues
//Called as linear data structures as they store data next to each other
public class LinearSearch {
	public static void main(String args[]) {
		int arr[] = {23, 54, 57, 12, 90};
		int key = 57;
		System.out.println(linerSearch(arr, key));   // O(n)
		System.out.println(binarySearch(arr, key));  // O(log n)
	}
	
	static int binarySearch(int[] arr, int key) {   // O(n log n(sorting the array) + log n (for binary search))
		int low=0;
		int high=arr.length;
		Arrays.sort(arr);               //O(n log n)
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}else if(key < arr[mid]){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}	
		return -1;
	}
	
	static int linerSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
