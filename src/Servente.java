import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Servente extends UnicastRemoteObject implements Projeto{
	private static final long serialVersionUID = 1L;

	protected Servente() throws RemoteException{
		super();
	}
	
	public double dolarToReais(double a) throws RemoteException{
		return a * 4.22;
	}
	
	public double reaisToDolar(double a) throws RemoteException{
		return a * 0.24;
	}

	public double reaisToEuro(double a) throws RemoteException {
		return a * 0.21;
	}

	public double reaisToLibra(double a) throws RemoteException {
		return a * 0.18;
	}

	public double libraToreais(double a) throws RemoteException {
		return a * 5.46;
	}

	public double euroToreais(double a) throws RemoteException {
		return a * 4.67;
	}
}

