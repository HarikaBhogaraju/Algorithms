public class DuplicateElement {
public static void main(String args[]) {
	int[] array = {1,2,3,4,5,6,5};
	System.out.println(duplicate(array));
}

public static int duplicate(int[] array) {
	int n = array.length;
	int duplicateElement = -1;
	for(int i = 0;i<n;i++) {
		for(int j = i+1;j<n;j++) {
			if(array[i]==array[j]) {
				duplicateElement = array[i];
				break;
			}
		}
	}

	return duplicateElement;
}
}
