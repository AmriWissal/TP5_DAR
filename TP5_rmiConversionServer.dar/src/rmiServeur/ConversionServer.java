package rmiServeur;
//Iportation pour RMI
import rmiService.ConversionImpl;
import rmiService.IConversion;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
//Definition de la classe ConversionServeur
 public class ConversionServer {
      //Definition de la Methode main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {	
			 // Creation du registre locale sur le port 1099
	            LocateRegistry.createRegistry(1099);
	            //instantiation de la methode ConversionImpl implimentée par l'inerface Iconversion 
	            ConversionImpl od = new ConversionImpl();
	            //Affichage de l'objet distant 
	            System.out.println(od.toString());
	            //Liaison de l'objet distant et son no dans le Registre RMI 
	            Naming.rebind("rmi://localhost:1099/ConversionObject",od);
	        } catch (RemoteException | MalformedURLException e) {
	            throw new RuntimeException(e);// Exception en cas d'erreurs 
	        }

	}

}
