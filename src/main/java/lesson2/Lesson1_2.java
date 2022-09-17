package lesson2;

import java.io.FileNotFoundException;

public class Lesson1_2 {

	//������� 2, ���������� ������� ������ ��� �� ��� ������ �������
	public static void main(String[] args) throws Exception {
		int[] intArray = new int[9];
		try {
			int d = 0;
			double catchedRes1 = intArray[8] / d;
			System.out.println("catchedRes1 = " + catchedRes1);
		} catch (ArithmeticException e) {
			System.out.println("Catching exception: " + e);
		}


		System.out.println("====================================");
//
//������� 3, ������� ���������� Throwable, � ����� ���, ��� ��� ��� ������� � ������ ���������� ���, ����� � ���� �� �����
//	�������� ������ catch
		try {
			int a = 90;
			int b = 3;
			System.out.println(a / b);
			printSum(23, 234);
			int[] abc = {1, 2};
			abc[3] = 9;
		} catch (NullPointerException ex) {
			System.out.println("��������� �� ����� ��������� �� null!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("������ ������� �� ������� ������ �������!");
		} catch (Throwable ex) {
			System.out.println("���-�� ����� �� ���...");
		}
	}

	public static void printSum(Integer a, Integer b) throws FileNotFoundException {
		System.out.println(a + b);
	}

}
