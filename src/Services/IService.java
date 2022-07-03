package Services;

import Models.Chambre;
import Models.Etudiant;
import Models.Pavillion;


public interface IService {
    //pavillon service
    public void addPavillion(Pavillion Pavillion);
    public void listerPavillion() ;

   // chambre service
    public void addChambre(Chambre chambre);
    public void listerChambre() ;
    public void ajouterEtudiant(Etudiant etudiant);

    
}
