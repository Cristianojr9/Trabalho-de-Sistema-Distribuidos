import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Projeto extends Remote{
	public double dolarToReais(double a) throws RemoteException;
	
	public double reaisToDolar(double a) throws RemoteException;

	public double reaisToEuro(double a) throws RemoteException;

	public double reaisToLibra(double a) throws RemoteException;

	public double libraToreais(double a) throws RemoteException;
	
	public double euroToreais(double a) throws RemoteException;
}
