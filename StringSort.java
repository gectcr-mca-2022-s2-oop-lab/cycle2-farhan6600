
//Pr-8 String sort

package cycle2;

import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array :\t");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String array[] = new String[size];
		System.out.println("Enter the strings:\n");

		for (int j = 0; j < size; j++)
			array[j] = sc.next();

		String temp = "";
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int compare = (array[i].toLowerCase()).compareTo((array[j].toLowerCase()));
				if (compare < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);

		}
		sc.close();
	}
}