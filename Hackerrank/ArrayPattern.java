
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total size of the array");
		int n = sc.nextInt();

		System.out.println("Enter values to the array");

		ArrayList<Integer> value = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			value.add(sc.nextInt());
		}

		getPettern(value);

	}

	public static void getPettern(ArrayList<Integer> a) {
		
		int sum = 0;
		
		for(int i = 0; i<a.size();i++) {
			sum = sum+a.get(i);
		}
		
		System.out.println(sum);
	}
}
