package HomeWork3;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = getNumber();
		double result = getCoub(num1);
		System.out.println("��� ������ ����� �����: " + getCoub(num1));
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

	public static double getCoub(double num1) {

		return Math.pow(num1, 3);
	}
}
