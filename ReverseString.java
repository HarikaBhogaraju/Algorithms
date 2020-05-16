import java.util.*;
public class ReverseString {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a string: ");
	String s = sc.nextLine();
	System.out.println(reverse(s));
}
public static String reverse(String str) {
	int n = str.length();

	if(n == 0) {
		return "";
	}
	else {
		return str.charAt(n-1)+reverse(str.substring(0,n-1));
	}
}
}
