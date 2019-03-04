public class InsertionSort implements SortingAlgorithm{
	public void sort(int [] a){
		int temp; // store the value which is going to be inserted.
		int j;
		for(int i=1;i<a.length;i++){ // make space for the insertion and find the right place to insert.
			temp=a[i];
			j=i-1;
			while(j>=0&&a[j]>temp){ //check whether the value is smaller than the temp, does the loop go through everything before the temp.
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp; // insert
		}
	}
}
