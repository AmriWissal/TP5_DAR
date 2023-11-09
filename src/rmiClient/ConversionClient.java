package rmiClient;
//Importations des classes  RMI
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
//Definition de la classe ConversionClient 
public class ConversionClient {
	//définition de la classe main 
    public static void main(String[] args) {
    	//initialisation
        IConversion stub;
            try {
            	// // Utilisation de Naming.lookup pour faire référence a distance à l'objet 
                stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
                // Appel à la méthode montantConv
                double montantConv =stub.convertirMontant(20);
                //Affichage du montant convertit
                System.out.println(montantConv);
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                throw new RuntimeException(e);// Exception en cas d'erreur 
            }
        }
    }

