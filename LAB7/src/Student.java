
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	public Student(String n, String p, Masina m) {
		this.nume = n;
		this.prenume = p;
		this.masina = m;
	}
	
	public Masina getMasina() {
		return masina;
	}
	
	public Student clone() {
		try {
			Student copieStudent;
			copieStudent = (Student)super.clone();
			//copieStudent.masina = masina.clone();
			copieStudent.masina = new Masina(masina.getMarca(), masina.getCuloare());
			return copieStudent;
		}
		catch(Exception e) {
			System.out.println("NOT CLONEABLE");
			return null;
		}
	}
	
	public String toString() {
		return nume + " " + prenume + " are " + masina.getMarca() + " de culoare " + masina.getCuloare();
	}
}
