package chap10;
public class Etudiant {
	private String nom;
	private int age;
	
	public Etudiant(String nom, int age) {
		setNom(nom);
		setAge(age);
	}

	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
        this.nom = nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}