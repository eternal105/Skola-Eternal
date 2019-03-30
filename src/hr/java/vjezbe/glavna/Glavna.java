package hr.java.vjezbe.glavna;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import hr.java.vjezbe.entitet.Ispit;
import hr.java.vjezbe.entitet.Predmet;
import hr.java.vjezbe.entitet.Profesor;
import hr.java.vjezbe.entitet.Student;

public class Glavna {

	public static void main(String[] args) {
		System.out.println("PROGRAM POKRENUT");
		
		Scanner s = new Scanner(System.in);
		
		Profesor[] profesori = UnuseiProfesore(s);
		Predmet[] predmeti = UnuseiPredmete(s, profesori);
		Student[] studenti = UnesiStudente(s, predmeti);
		Ispit[] ispitniRokovi = UnesiIspiteRokove(s, predmeti, studenti);
		
		IspisiOdlcneStudente(ispitniRokovi);
		
		s.close();
		System.out.println("PROGRAM ZAUSTAVLJEN");
	}

	private static Profesor[] UnuseiProfesore(Scanner s) {
		int brojProfesora;
		do
		{
			System.out.println("Unesite broj profesora koji želite unjeti(min 2):");
			brojProfesora = s.nextInt();
			s.nextLine();
		}while(brojProfesora < 2);
		
		Profesor[] profesori = new Profesor[brojProfesora];
		
		for (int i = 0; i < brojProfesora; i++) {
			System.out.println("Unesite sifru profesora:");
			String sifra = s.nextLine();
			System.out.println("Unesite ime profesora:");
			String ime = s.nextLine();
			System.out.println("Unesite prezime profesora:");
			String prezime = s.nextLine();
			System.out.println("Unesite titulu profesora:");
			String titula = s.nextLine();
			Profesor p = new Profesor(sifra, ime, prezime, titula);
			profesori[i] = p;
		}
		
		return profesori;
	}
	
	private static Predmet[] UnuseiPredmete(Scanner s, Profesor[] profesori) {
		int brojPredmeta;
		do
		{
			System.out.println("Unesite broj predmeta koji želite unjeti(min 3):");
			brojPredmeta = s.nextInt();
			s.nextLine();
		}while(brojPredmeta < 3);
		
		Predmet[] predmeti = new Predmet[brojPredmeta];
		
		for (int i = 0; i < brojPredmeta; i++) {
			System.out.println("Unesite sifru predmeta:");
			String sifra = s.nextLine();
			System.out.println("Unesite naziv predmeta:");
			String naziv = s.nextLine();
			System.out.println("Unesite broj ects bodova:");
			Integer brojEctsBodova = s.nextInt();
			s.nextLine();
			Profesor nositelj = null;
			int profesorId;
			do
			{
				System.out.println("Odaberite broj ispred imena profesora, kao nositeljapredmeta:");
				int j = 1;
				for (Profesor profesor : profesori) {
					System.out.println(j + ". " + profesor);
					j++;
				}
				profesorId = s.nextInt();
				s.nextLine();
			}while(profesorId < 1 || profesorId > profesori.length);
			nositelj = profesori[profesorId - 1];
			Predmet p = new Predmet(sifra, naziv, brojEctsBodova, nositelj);
			predmeti[i] = p;
		}
		
		return predmeti;
	}
	
	private static Student[] UnesiStudente(Scanner s, Predmet[] predmeti) { 
		int brojStudenata;
		do
		{
			System.out.println("Unesite broj studenata koji želite unjeti(min 2):");
			brojStudenata = s.nextInt();
			s.nextLine();
		}while(brojStudenata < 2);
		
		Student[] studenti = new Student[brojStudenata];
		
		for (int i = 0; i < brojStudenata; i++) {
			System.out.println("Unesite ime studenta:");
			String ime = s.nextLine();
			System.out.println("Unesite prezime studenta:");
			String prezime = s.nextLine();
			System.out.println("Unesite jmbag studenta:");
			String jmbag = s.nextLine();
			System.out.println("Unesite datum roðenja studenta(dd.MM.yyyy):");
			String datum = s.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			LocalDate datumRodjenja = LocalDate.parse(datum, formatter);
			Student st = new Student(ime, prezime, jmbag, datumRodjenja);
			studenti[i] = st;
		}
		
		for (Predmet predmet : predmeti) {
			predmet.setStudenti(studenti);
		}
		
		return studenti;
	}
	
	private static Ispit[] UnesiIspiteRokove(Scanner s, Predmet[] predmeti, Student[] studenti) {
		int brojIspita;
		do
		{
			System.out.println("Unesite broj ispitnih rokova koji želite unjeti(min 1):");
			brojIspita = s.nextInt();
			s.nextLine();
		}while(brojIspita < 1);
		
		Ispit[] ispiti = new Ispit[brojIspita];
		
		for (int i = 0; i < brojIspita; i++) {
			Predmet predmet = null;
			int predmetId;
			do
			{
				System.out.println("Odaberite broj ispred naziva predmeta:");
				int j = 1;
				for (Predmet p : predmeti) {
					System.out.println(j + ". " + p.getNaziv());
					j++;
				}
				predmetId = s.nextInt();
				s.nextLine();
			}while(predmetId < 1 || predmetId > predmeti.length);
			predmet = predmeti[predmetId-1];
			Student student = null;
			int studentId;
			do
			{
				System.out.println("Odaberite broj ispred imena studenta:");
				int j = 1;
				for (Student st : studenti) {
					System.out.println(j + ". " + st);
					j++;
				}
				studentId = s.nextInt();
				s.nextLine();
			}while(studentId < 1 || studentId > studenti.length);
			student = studenti[studentId-1];
			System.out.println("Unesite ocjenu:");
			Integer ocjena = s.nextInt();
			s.nextLine();
			System.out.println("Unesite datum i vrijeme ispita dd.MM.yyyy.THH:mm");
			String datum = s.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.'T'HH:mm");
			LocalDateTime datumIVrijeme = LocalDateTime.parse(datum, formatter);
			Ispit is = new Ispit(predmet, student, ocjena, datumIVrijeme);
			ispiti[i] = is;
		}
		
		return ispiti;
	}

	private static void IspisiOdlcneStudente(Ispit[] ispitniRokovi) {
		for (Ispit ispit : ispitniRokovi) {
			Student s = ispit.getStudent();
			String np = ispit.getPredmet().getNaziv();
			if (ispit.getOcjena() == 5) {
				System.out.println("Student " + s + " je ostvario ocjenu 'izvrstan' na predmetu '" + np + "'");
			}
		}
		
	}
}
