package hr.java.vjezbe.entitet;

import java.time.LocalDateTime;

public class Ispit {

	private Predmet Predmet;
	private Student Student;
	private Integer Ocjena;
	private LocalDateTime DatumIVrijeme;
	
	public Ispit(hr.java.vjezbe.entitet.Predmet predmet, hr.java.vjezbe.entitet.Student student, Integer ocjena,
			LocalDateTime datumIVrijeme) {
		Predmet = predmet;
		Student = student;
		Ocjena = ocjena;
		DatumIVrijeme = datumIVrijeme;
	}
	
	public Predmet getPredmet() {
		return Predmet;
	}
	public void setPredmet(Predmet predmet) {
		Predmet = predmet;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	public Integer getOcjena() {
		return Ocjena;
	}
	public void setOcjena(Integer ocjena) {
		Ocjena = ocjena;
	}
	public LocalDateTime getDatumIVrijeme() {
		return DatumIVrijeme;
	}
	public void setDatumIVrijeme(LocalDateTime datumIVrijeme) {
		DatumIVrijeme = datumIVrijeme;
	}
	
	
}
