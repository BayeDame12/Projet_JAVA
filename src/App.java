import java.util.Scanner;

import Models.Chambre;
import Models.Pavillion;
import Models.Responsable;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*****************************************************\n");

        System.out.println("******BIENVENUE SUR LA GESTION DES LOGEMENT UCAD*****\n");
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        Responsable res = new Responsable();    
    
            System.out.println("**********BIENVENUE SUR L ENTITY PAVILLION************");
                   System.out.println("1.Pour Afficher Les Pavillon:\n");
                    switch (n) {
                        case 1: Pavillion p = new Pavillion();
                        p.setId(1);
                        p.setNom("A");
                        p.setNbrEtages(4);
                        res.addPavillion(p);
                        res.listerPavillion();
                            break;
                            case 2: System.out.println("**********BIENVENUE SUR L ENTITY PAVILLION************");
                            System.out.println("2.Pour Afficher Les Chambre:\n");
                            
                             Chambre c = new Chambre();
                             c.setId(1);
                             c.setNumero(1);
                             c.setEtage(1); 
                             res.addChambre(c);
                             res.listerChambre();                   
                       
                        
                            default:
                                break;
                        }
                    }

           
                       
                }


        



    

