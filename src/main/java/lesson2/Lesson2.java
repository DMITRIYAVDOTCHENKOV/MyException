package lesson2;

import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;
//Я не понимаю куда надо вставить брейк, что бы цыкл прекратился, он постоянно просит число,
// через if  вообще сразу падает, не получается что бы он вывел ошибку и просил пробовать еще раз .
public class Lesson2 {
	public static void main(String[] args) {
		fractionalNumberRequest();

	}
	public static void fractionalNumberRequest() {
		float number = 0;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Введите дробное число");
				number = scanner.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Не верный формат");
				System.out.println("Проверьте что вы ввели именно число!, и убедитесь что используйте запятую!");
			}
				System.out.println("Вы ввели: " + number);
			}
		}
	}


