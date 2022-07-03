package Models;
import java.util.Date;

public class Etudiant {
    private String  matricule;
    private String  email;
    private String  telephone;
    private String  adresse;
    private Date  dateNaiss;
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Date getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    @Override
    public String toString() {
        return "Etudiant [adresse=" + adresse + ", dateNaiss=" + dateNaiss + ", email=" + email + ", matricule="
                + matricule + ", telephone=" + telephone + "]";
    }
}
