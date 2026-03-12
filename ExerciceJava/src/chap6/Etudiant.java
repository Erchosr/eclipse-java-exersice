package chap6;
public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private double moyenne;
	
	public Etudiant (String nom, String prenom, int age, double moyenne) {
		setNom(nom);
		setPrenom(prenom);
		setAge(age);
		setMoyenne(moyenne);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
    	if (age >= 0) {
    		this.age = age;
    	} else {
    		this.age = 0;
    	}
    }
    
    public double getMoyenne() {
        return this.moyenne;
    }

    public void setMoyenne(double moyenne) {
        if (moyenne >= 0 && moyenne <= 20) {
            this.moyenne = moyenne;
        } else {
            this.moyenne = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", moyenne=" + moyenne +
                '}';
    }
}