public class MaxProduct {
public static void main(String args[]) {
	int[] array = {3,2,1,4,5,8,7,6};
	System.out.println(findMaxProd(array));
}
public static int findMaxProd(int[] array) {
	MaxProduct.sort(array);
	int prod = array[0]*array[1]; //two of the largest elements in the sorted array
	return prod;
}

public static void sort(int[] array) {//bubble sort
	int temp = 0;
	for(int i = 0;i<array.length;i++) {
		for(int j = 0;j<array.length;j++) {
			if(array[i]>array[j]) {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
	}
}
}
