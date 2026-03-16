package chap8;
public class EmployeFreelance extends Employe {

    private double heuresTravaillees;
    private double tauxHoraire;

    public EmployeFreelance(String nom, double heuresTravaillees, double tauxHoraire) {
        super(nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * tauxHoraire;
    }
}