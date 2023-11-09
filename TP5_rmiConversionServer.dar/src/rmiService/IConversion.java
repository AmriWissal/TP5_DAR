package rmiService;
//Importation des classes  RMI 
import java.rmi.Remote;
import java.rmi.RemoteException;
//Définition de l'interface IConversion
public interface IConversion extends Remote {
	double convertirMontant(double mt) throws RemoteException; //RemoteException en cas d 'erreur 

}
