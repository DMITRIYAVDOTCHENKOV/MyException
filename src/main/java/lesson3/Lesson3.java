package lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//
///*
//* �������� ����������, ������� ����� ����������� � ������������ ��������� ������ � ������������ �������, �����������
//* ��������:
//������� ��� �������� ������������ ������������� ���
//������� ������:
//�������, ���, �������� - ������
//����_�������� - ������ ������� dd.mm.yyyy
//�����_�������� - ����� ����������� ����� ��� ��������������
//��� - ������ ��������� f ��� m.
//���������� ������ ��������� ��������� ������ �� ����������. ���� ���������� �� ��������� � ���������, ������� ��� ������,
//*  ���������� ��� � �������� ������������ ���������, ��� �� ���� ������ � ������ ������, ��� ���������.
//���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������. ���� ������� ������
//* �� ���������, ����� ������� ����������, ��������������� ���� ��������. ����� ������������ ���������� ���� java �
//* ������� ����. ���������� ������ ���� ��������� ����������, ������������ �������� ��������� � �����������, ��� ������
//* �������.
//���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������, � ���� � ���� ������ ������
//*  ���������� ���������� ������, ����
//<�������><���><��������><������������> <�������������><���>*/
//
//import com.sun.jdi.CharType;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//

public class Lesson3 {
	
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) {
		System.out.println("������� ������ ����� ������ ���, ���� ��������(��.��.����), ����� �������� , � ��� ( �/�)");
		try {
			Anketa anketa = new Anketa(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}