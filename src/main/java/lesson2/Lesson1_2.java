package lesson2;

import java.io.FileNotFoundException;

public class Lesson1_2 {

	//«адание 2, получаетс€ дописал массив что бы был нужный элемент
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
//«адание 3, перенес исключение Throwable, в самый низ, так как оно главное и посути отлавливал все, св€зи с этим не могли
//	работать другие catch
		try {
			int a = 90;
			int b = 3;
			System.out.println(a / b);
			printSum(23, 234);
			int[] abc = {1, 2};
			abc[3] = 9;
		} catch (NullPointerException ex) {
			System.out.println("”казатель не может указывать на null!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("ћассив выходит за пределы своего размера!");
		} catch (Throwable ex) {
			System.out.println("„то-то пошло не так...");
		}
	}

	public static void printSum(Integer a, Integer b) throws FileNotFoundException {
		System.out.println(a + b);
	}

}
