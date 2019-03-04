
public class MergeSort implements SortingAlgorithm {

	void merge(int [] left, int [] right, int [] a) { // merge two sorted array into a big array.
		int left_index = 0;
		int right_index = 0;
		int target_index = 0;
		while(left_index<left.length&&right_index<right.length) { // put values in the big array in order.
			if(left[left_index]<right[right_index]) {
				a[target_index++] = left[left_index++];
			} 
			else {
				a[target_index++] = right[right_index++]; 
			}
		}
		while(left_index<left.length) { // put the remaining in the big array.
			a[target_index++] = left[left_index++];
		}
		while(right_index<right.length) { // put the remaining in the big array.
			a[target_index++] = right[right_index++];
		}
	
	}
	public void sort(int [] a) { 
		if(a.length>1) { // seperate the array into two parts until the length of the array is one.
			int mid = a.length/2; // find the mid point.
			int [] left = new int[mid];
			int [] right = new int[a.length-mid];
			for(int i = 0; i<mid; i++) {
				left[i] = a[i];
			}
			for(int i = mid; i<a.length; i++) {
				right[i-mid] = a[i];
			} // generate two samller array.
			sort(left);
			sort(right);
			merge(left,right,a); //merge
		}
	}
}