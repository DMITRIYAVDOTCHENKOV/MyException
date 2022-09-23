package lesson3.dzLesson3_4;

class MyArraySizeException extends RuntimeException {
	MyArraySizeException(String msg) {
		super("Ошибка размерности массива.\n" + " " + msg);
	}
	
}