/**
 * 
 */
package HomeWork3;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Task3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = getNumber();
		double num2 = getNumber();
		double result = getMin(num1, num2);
		System.out.println("����������� �����: " + result);

	}

	public static double getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����:");
		if (scanner.hasNextDouble()) {
			return scanner.nextDouble();
		} else {
			System.out.println("������ ��� �����. ��������� ����");
			return getNumber();
		}

	}

	public static double getMin(double num1, double num2) {
		if (num1 > num2) {
			return num2;
		} else {

			return num1;
		}
	}
}
