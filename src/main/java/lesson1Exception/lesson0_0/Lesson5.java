package lesson1Exception.lesson0_0;

//���������� ����� checkArray(Integer[] arr), ����������� � �������� ��������� ������������� ���������� ������.
//		����� ������ �������� �� ������� �������� � ��������� ��� �� �� ����� null.
//		� ������ ���������� ��������� ������ (����� ���� ������ ��� ����������):
//		���� � �����-�� ������ ���������� null, �� ���������� ������������ �� ���� ������������
//		���� null�� ����������� � ���������� �������, �� �������� ���� �� ��� �� ������������
//
//

public class Lesson5 {
	public static void main(String[] args) {
		Integer[] array = {1,4,6,null,3,2,null,9,7,null,4};
		checkArray(array);

	}

	public static void checkArray(Integer[] arr) {
		StringBuilder sb =  new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null){
				System.out.println("� ������ " + i + " ��������� null");
				sb.append(i + " ");

			}
		}
		if (sb.length() == 0){
			sb.append("�� ");
		}
		System.out.println("� ������� " + sb.toString() + "��������� null");
 	}
}
