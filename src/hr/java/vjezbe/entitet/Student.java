package hr.java.vjezbe.entitet;

import java.time.LocalDate;

public class Student {

	private String Ime;
	private String Prezime;
	private String Jmbag;
	private LocalDate DatumRodjenja;
	
	public Student(String ime, String prezime, String jmbag, LocalDate datumRodjenja) {
		Ime = ime;
		Prezime = prezime;
		Jmbag = jmbag;
		DatumRodjenja = datumRodjenja;
	}
	
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public void setPrezime(String prezime) {
		Prezime = prezime;
	}
	public String getJmbag() {
		return Jmbag;
	}
	public void setJmbag(String jmbag) {
		Jmbag = jmbag;
	}
	public LocalDate getDatumRodjenja() {
		return DatumRodjenja;
	}
	public void setDatumRodjenja(LocalDate datumRodjenja) {
		DatumRodjenja = datumRodjenja;
	}

	@Override
	public String toString() {
		return this.Jmbag + " " + this.Ime + " " + this.Prezime;
	}
}
