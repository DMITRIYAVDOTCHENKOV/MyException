package lesson3.dzLesson3_4;

class MyArrayDataException extends RuntimeException {
	MyArrayDataException(String msg) {
		super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
	}
	
}