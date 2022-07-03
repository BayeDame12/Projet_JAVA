package Models;

public class Chambre {
    
    private String type;
    private int id;
    private int numero;
    private int etage;

    private Pavillion pavillon;
    private Responsable resp;
  
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getEtage() {
        return etage;
    }
    public void setEtage(int etage) {
        this.etage = etage;
    }
    public Pavillion getPavillon() {
        return pavillon;
    }
    public void setPavillon(Pavillion pavillon) {
        this.pavillon = pavillon;
    }
    public Responsable getResp() {
        return resp;
    }
    public void setResp(Responsable resp) {
        this.resp = resp;
    }
    @Override
    public String toString() {
        return "Chambre [etage=" + etage + ", id=" + id + ", numero=" + numero + ", pavillon=" + pavillon + ", resp="
                + resp + ", type=" + type + "]";
    }
    public void setPavillon(String string) {
    }
}
