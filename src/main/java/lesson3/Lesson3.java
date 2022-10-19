package lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//
///*
//* Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные
//* пробелом:
//Фамилия Имя Отчество датарождения номертелефона пол
//Форматы данных:
//фамилия, имя, отчество - строки
//дата_рождения - строка формата dd.mm.yyyy
//номер_телефона - целое беззнаковое число без форматирования
//пол - символ латиницей f или m.
//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки,
//*  обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных
//* не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и
//* создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно
//* неверно.
//Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны
//*  записаться полученные данные, вида
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>*/
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
		System.out.println("Введите данные через пробел ФИО, дату рождение(дд.мм.гггг), номер телефона , и пол ( М/Ж)");
		try {
			Anketa anketa = new Anketa(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}