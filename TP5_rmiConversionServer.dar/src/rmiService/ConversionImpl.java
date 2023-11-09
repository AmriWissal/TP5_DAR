package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {
	public ConversionImpl() throws RemoteException {
    }
	
	public double convertirMontant(double mt) throws RemoteException {
		return mt*3.3;
}
}
