package lesson2;

import java.util.Scanner;

public class Lesson2_3 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������");
		String str = scanner.nextLine();
		if (str.length() < 0 | str.isEmpty() | str == null){
			throw new Exception("������ ������");
		}else {
			System.out.println("�� �����: " + str);
		}
	}
}
