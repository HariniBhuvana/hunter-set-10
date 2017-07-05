import java.util.Scanner;

public class RepeatedArray {

	private static Scanner s;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Elements :");
		int b = s.nextInt();
		System.out.println("Enter Elements");
		int ar[] = new int[b];
		int arr[] = new int[ar.length];
		for (int i = 0; i < b; i++) {
			ar[i] = s.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					arr[i] = ar[i];
				}
			}
		}
		System.out.print("The Repeated Numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				System.out.print(arr[i] + " ");
		}
	}
}
