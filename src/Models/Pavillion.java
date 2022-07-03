package Models;

public class Pavillion {
    private int id;
    private String nom;
    private int nbrEtages;
    private Pavillion pavillon;
    private Responsable resp;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbrEtages() {
        return nbrEtages;
    }
    public void setNbrEtages(int nbrEtages) {
        this.nbrEtages = nbrEtages;
    }
    @Override
    public String toString() {
        return "Pavillion [id=" + id + ", nbrEtages=" + nbrEtages + ", Nom=" + nom + "]";
    }
}
