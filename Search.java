//Search an element

package cycle2;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array :\t");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements:\n");
		int j, i;
		for (j = 0; j < size; j++)
			array[j] = sc.nextInt();

		System.out.println("Enter the element to search:");
		int ele = sc.nextInt();
		int flag = 0;
		for (i = 0; i < size; i++) {
			if (array[i] == ele) {

				flag++;
				break;
			}
		}
		if (flag > 0)
			System.out.println("Element found at position " + (i + 1));
		else
			System.out.println("Element not found");

		sc.close();
	}

}
