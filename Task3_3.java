package HomeWork3;

import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = getNumber();
		double result = getSquare(num1);
		System.out.println("������� ������ ����� �����: " + getSquare(num1));
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

	public static double getSquare(double num1) {

		return Math.pow(num1, 2);
	}
}
