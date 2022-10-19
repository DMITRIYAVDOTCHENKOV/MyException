package lesson3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class DataVerification {

	final static String DATE_FORMAT = "dd.MM.yyyy";
	ArrayList<String> forms;
	String[] arrForma;

	public boolean TrouAndFalse(String[] arr) {
		arrForma = arr;
		checkingArrayIndexes();
		return checkingTheInputDataForValidity(arrForma);
	}

	public void checkingArrayIndexes() {
		if (arrForma.length < 6) {
			throw new IndexOutOfBoundsException("�� ����� ���� ������");
		} else if (arrForma.length > 6) {
			throw new IndexOutOfBoundsException("�� ����� ������� ����� ������");
		}
	}

	public boolean checkingTheInputDataForValidity(String[] arr) {
		return checkTheLastName(arr) && checkTheFirstName(arr[1]) && checkThePatronymic(arr[2]) &&
					   checkTheDate(arr[3]) && checkThePhoneNumber(arr[4]) &&
					   checkTheGender(arr[5]);
	}

	private boolean checkTheLastName(String[] arrForma) {
		if (!(arrForma[0] instanceof String)) {
			throw new RuntimeException("������ ���� �����");
		}
		return true;
	}



	private boolean checkTheFirstName(String arrForma) {
		return checkingWhetherThisLineIs(arrForma instanceof String, "�� ����� �� ����� ������ �����, ��������� ������ �����");
	}

	private boolean checkingWhetherThisLineIs(boolean arrForma, String message) {
		if (arrForma){
			return true;
		}else {
			throw new RuntimeException(message);
		}
	}

	private boolean checkThePatronymic(String arrForma) {
		return checkingWhetherThisLineIs(arrForma instanceof String, "�� ����� �� ����� ������ �����, ��������� ������ �����");
	}

	private boolean checkTheDate(String arrForma) {

		try {
			DateFormat df = new SimpleDateFormat(DATE_FORMAT);
			df.setLenient(false);
			df.parse(arrForma);
			return true;
		} catch (ParseException e) {
			System.out.println("�� ������ ������ ���� (��.��.����");
			return false;
		}
	}
	private boolean checkThePhoneNumber(String arrForma) {
		if (arrForma.length() < 10 || arrForma.length() > 11){
			throw new RuntimeException("�� ������ ������, ������ ���� 10-11 ����");
		}
		try {
			long number = Long.parseLong(arrForma);
			return true;
		}catch (Exception e){
			throw new RuntimeException("�������� ������ �����");
		}
	}
	private boolean checkTheGender(String arrForma) {
		return checkingWhetherThisLineIs(arrForma.equals("�") || arrForma.equals("�") || arrForma.equals("�") || arrForma.equals("�"), "������ �� ������ ������ ���������� �������: � � � � ");
	}
}
