package lesson1Exception.lesson0_0.DZvsLesson1;
//���������� 3 ������, ����� � ������ �� ��� �������� ������ ����������
//		���������� �� ���, � ��������� ������� ������ ����� ���������� �� ��� ������� ��������?
//		���������� �����, ����������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������, ������ ������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������. ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������.
//		* ���������� �����, ����������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������, ������ ������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������. ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������. �����: ��� ���������� ������ ������������ ����������, ������� ������������ ����� ������� - RuntimeException, �.�. ����.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class DzLesson1 {
	public static void main(String[] args) throws FileNotFoundException {
		int[] array = {8, 2, 6, 4, 5, 20};
		int[] array2 = {2, 4, 5, 6, 7, 8};




//		arithmeticExceptionDivisionByZero(5, 1);
//	    exceedingTheArrayByIndex(array,1);
//	    fileSize(new File("test1.txt"));
		createTwoArraysAndGetTheThirdOne(array, array2);


	}

	public static void arithmeticExceptionDivisionByZero(int a, int b) {
		try {
			int sum = a / b;
		} catch (ArithmeticException e) {
			System.out.println("�� ���� ������ ������!!");
		} finally {
			if (b != 0) {
				System.out.println(a / b);
			}
//		if (b == 0) {
//			System.out.println("Error, ������� �� ���� �� ����. ������� ����� > 0");
//		} else if (b > 0) {
//			int sum = a / b;
//			System.out.println(sum);
		}
	}

	public static void exceedingTheArrayByIndex(int[] arr, int index) {
		try {
			if (arr.length < arr[index]) ;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("����� �� ������ �������");
		} finally {
			if (arr.length > index) {
				System.out.println(arr[index] + " = ������ ������� ��� index " + index);
			}
		}

//		if (arr.length < index){
//			System.out.println("����� �� ������ �������");
//		}
//		System.out.println(arr[index] + " = ������ ������� ��� index " + index);
	}

	public static void fileSize(File file) {
		if (!file.exists()) {
			System.out.println("������� ����� �� ����������, ��������� ����!");
		}
		System.out.println(file.length());
	}

	public static void createTwoArraysAndGetTheThirdOne(int[] arr1, int[] arr2) {
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("������� ����� ������, ��������� �� ������� ������ ����");
		if (arr1.length != arr2.length) {
			System.out.println("�������� �� ��������, ������� ������ �����!!");
		}else {
		int[] c = IntStream.range(0, arr1.length).map(i -> arr1[i] - arr2[i]).toArray();
		System.out.println(Arrays.toString(c));
			}
		}
	}
