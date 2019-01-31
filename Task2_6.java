package rab;

import java.util.Scanner;

public class exe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = scanner.nextInt(); // read from keybord value of length array
		int[] array = new int[size];
		System.out.print("Enter array numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int temp; // varrible for replace elements
		// int n = array.length;
		for (int i = 1; i < array.length - 2; i++) {
			temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
			i = i + 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}
}
