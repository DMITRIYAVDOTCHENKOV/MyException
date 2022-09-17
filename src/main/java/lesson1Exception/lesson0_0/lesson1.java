package lesson1Exception.lesson0_0;

import java.util.ArrayList;
import java.util.Scanner;

public class lesson1 {
	private static final int MY_ARRAY_LENGTH = 4;

	public static void main(String[] args) {
		int[] array = new int[6];
		array[0] = 4;
		array[1] = 1;
		array[2] = 7;
		array[3] = 4;
		array[4] = 3;
		array[4] = 5;


		System.out.println(myLesson1(array, 3));
		System.out.println("===============");
		myTestLesson1Scanner(array);
	}

	public static int myLesson1(int[] arr, int number) {
		if (arr == null) return -3;
		if (arr.length < MY_ARRAY_LENGTH) return -1;
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == number) return i;
		}
		return -2;
	}
	public static  void myTestLesson1Scanner(int[] array){
		System.out.println("Введите целочисленное число");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int test = myLesson1(array, number);
		switch (test){
			case -1:
				System.out.println("Длина меньше заданного");
				break;
			case -2:
				System.out.println("Искомый элемент не найден");
				break;
			case -3:
				System.out.println("Вместо массива пришел null");
				break;
			default:
				System.out.println("Индекс искомого элемента: " + test);
		}
	}
}
