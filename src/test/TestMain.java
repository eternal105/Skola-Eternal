package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import hr.java.vjezbe.entitet.Student;

public class TestMain {

	public static void main(String[] args) {
		
		Student s = new Student("Anita", "Sanader", "12345678945621", LocalDate.of(1994, 12, 12));
		
		System.out.println("Hello world test");
		System.out.println("Dodan student:");
		System.out.println(s.getIme());
		System.out.println(s.getPrezime());
		System.out.println(s.getJmbag());
		System.out.println(s.getDatumRodjenja());
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Unesite datum i vrijeme ispita dd.MM.yyyy.HH:mm");
//		String datum = sc.nextLine();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.HH:mm");
//		LocalDateTime datumIVrijeme = LocalDateTime.parse(datum, formatter);
//		System.out.println(datumIVrijeme);
		
		String jmbg = "0207989330172";
		int dan = Integer.parseInt(jmbg.substring(0, 2));
		int mjesec = Integer.parseInt(jmbg.substring(2, 4));
		int godina = 1 + Integer.parseInt(jmbg.substring(4, 7));
		
		
		int a = 10;
		int b = 3;
		float c = (float)a / b;
		System.out.println(c);
		
		
		sc.close();
	}
}
