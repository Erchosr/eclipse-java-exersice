package chap8;
public class EmployeTempsPlein extends Employe {

    private double salaireMensuel;

    public EmployeTempsPlein(String nom, double salaireMensuel) {
        super(nom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double calculerSalaire() {
        return salaireMensuel;
    }
}