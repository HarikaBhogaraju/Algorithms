
public class SelectionSort {

public static void main(String args[]) {
	int[] array = {10,6,7,4,3,5,9,2,8,1};
	int size = array.length;
	SelectionSort.sort(array);
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
	}
}
	public static void sort(int[] array) {
		int indexOfMin = 0;
		int temp;
		int n = array.length;
		for(int i = 0;i<n;i++) {
			indexOfMin = i;
			for(int j = 0;j<10;j++) {
				if(array[j]<array[indexOfMin]) {
					indexOfMin = j;
				}
				//swapping i and min in the subarray
				temp = array[i];
				array[i] = array[indexOfMin];
				array[indexOfMin] = temp;
			}
		}
	}
}
