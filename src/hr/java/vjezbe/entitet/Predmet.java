package hr.java.vjezbe.entitet;

public class Predmet {

	private String Sifra;
	private String Naziv;
	private Integer BrojEctsBodova;
	private Profesor Nositelj;
	private Student[] Studenti;
	
	public Predmet(String sifra, String naziv, Integer brojEctsBodova, Profesor nositelj) {
		Sifra = sifra;
		Naziv = naziv;
		BrojEctsBodova = brojEctsBodova;
		Nositelj = nositelj;
	}
	
	public String getSifra() {
		return Sifra;
	}
	public void setSifra(String sifra) {
		Sifra = sifra;
	}
	public String getNaziv() {
		return Naziv;
	}
	public void setNaziv(String naziv) {
		Naziv = naziv;
	}
	public Integer getBrojEctsBodova() {
		return BrojEctsBodova;
	}
	public void setBrojEctsBodova(Integer brojEctsBodova) {
		BrojEctsBodova = brojEctsBodova;
	}
	public Profesor getNositelj() {
		return Nositelj;
	}
	public void setNositelj(Profesor nositelj) {
		Nositelj = nositelj;
	}
	public Student[] getStudenti() {
		return Studenti;
	}
	public void setStudenti(Student[] studenti) {
		Studenti = studenti;
	}
	
	
}
