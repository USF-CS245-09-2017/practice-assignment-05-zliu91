public class QuickSort implements SortingAlgorithm{

	public void sort (int [] a) { // call the quick sort method
		quicksort(a,0,a.length-1); 
	}

	void quicksort (int [] arr, int left, int right) { //replace the pivot, seperate the array into two parts, and quick sort these two parts again.
		if (left < right) {
			int p = partition(arr, left, right);
			quicksort(arr, left, p-1);
			quicksort(arr, p+1, right);
		}
	}

	void swap(int [] a,int i,int j){ //swap two elements in an array by index.
 		int temp = a[i];
 		a[i] = a[j];
 		a[j] = temp;
 	}

	int partition (int [] arr, int left, int right) { // seperate the array into two parts, one is totally bigger than the other.
		if (left < right) {
			int pivot = left;
			int i = left + 1; // Avoids re-sorting the pivot
			int j = right;
			while (i < j) {
				while (i <= right && arr[i] <= arr[pivot]) {					
					++i;
				}
				while (j >= i && arr[j] > arr[pivot]) {
					--j;
				}
				if (i <= right && i < j) {
					swap(arr, i, j);
				}
			}
			swap(arr, pivot, j);  // swap pivot to the middle
			return j;
		}
		return left;
	}
}