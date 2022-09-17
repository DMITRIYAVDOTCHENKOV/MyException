package lesson1Exception.lesson0_0;


//1)Реализуйте метод, принимающий в качестве аргумента  целочисленный массив.
//2)Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длина массива.


public class Lesson0 {
	private static final int MIN_ARRAY_LENGTH = 5;

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(getArrayLength(arr));

	}

	public static int getArrayLength(int[] array) {
		if (array.length >= MIN_ARRAY_LENGTH) {
			return array.length;
		} else {
			return -1;
		}
	}

}
