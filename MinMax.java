import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class MinMax {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        //find min and find max
        int n = arr.length;
        Arrays.sort(arr);
        long maxSum = 0;
        long minSum = 0;
        for(int i = 0;i<n-1;i++){
            minSum += arr[i];
        }
        for(int i = 1;i<n;i++){
            maxSum += arr[i];
        }

        System.out.print(minSum +" "+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
