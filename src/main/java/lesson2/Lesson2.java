package lesson2;

import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;
//� �� ������� ���� ���� �������� �����, ��� �� ���� �����������, �� ��������� ������ �����,
// ����� if  ������ ����� ������, �� ���������� ��� �� �� ����� ������ � ������ ��������� ��� ��� .
public class Lesson2 {
	public static void main(String[] args) {
		fractionalNumberRequest();

	}
	public static void fractionalNumberRequest() {
		float number = 0;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("������� ������� �����");
				number = scanner.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("�� ������ ������");
				System.out.println("��������� ��� �� ����� ������ �����!, � ��������� ��� ����������� �������!");
			}
				System.out.println("�� �����: " + number);
			}
		}
	}


