package Models;

import Services.IService;
public class Responsable implements IService{
    
            public final int NOMBRE = 10;
            private Pavillion pavillions[] = new Pavillion[NOMBRE];
            private int index;
            

    @Override
    public void addPavillion(Pavillion pavillion) {
        // TODO Auto-generated method stub
        if(index < NOMBRE){
            pavillions[index]=pavillion;
            index ++;
        }
        else{
             System.out.println("Le tableau est rempli");
        }
         
    }


  
    @Override
    public void listerPavillion() {
        
        for (Pavillion pavillion : pavillions) {
            if(pavillion != null){
                System.out.println(pavillion);
            }
        }
        
    }

    private Chambre chambres[] = new Chambre[NOMBRE];
    public void addChambre(Chambre chambre){

        if(index < NOMBRE){
            chambres[index] = chambre;
            index++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
    }
    public void listerChambre() {

        for (Chambre chambre : chambres) {
            if(chambre != null){
                System.out.println(chambre);
            }
        }
    }

    private Etudiant etudiants[] = new Etudiant[NOMBRE];
    public void ajouterEtudiant(Etudiant etudiant){




    }

}
