package hr.java.vjezbe.entitet;

public class Profesor {

	private String Sifra;
	private String Ime;
	private String Prezime;
	private String Titula;
	
	public Profesor(String sifra, String ime, String prezime, String titula) {
		Sifra = sifra;
		Ime = ime;
		Prezime = prezime;
		Titula = titula;
	}
	
	public String getSifra() {
		return Sifra;
	}
	public void setSifra(String sifra) {
		Sifra = sifra;
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
	public String getTitula() {
		return Titula;
	}
	public void setTitula(String titula) {
		Titula = titula;
	}

	@Override
	public String toString() {
		return this.Ime + " " + this.Prezime;
	}
}
