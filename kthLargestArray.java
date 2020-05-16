public class kthLargestArray {
	public static void main(String args[]) {
		int[] array = {3,2,1,4,5,8,7,6};
		System.out.println(klargest(array,1));
	}

	public static int klargest(int[] array,int k) {
		int kl;
		int n = array.length;
		if(k>n || k<0) {//invalid k value
			kl = 0;
		}
		else {
			kthLargestArray.sort(array);
			kl = array[k-1];
		}

		return kl;
	}

	public static void sort(int[] array) {//Bubble Sort
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
