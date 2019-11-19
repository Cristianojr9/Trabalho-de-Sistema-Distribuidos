import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class ProjetoServer {
	ProjetoServer(){
		try {
			System.setProperty("java.rmi.server.hostname", "127.0.1.1");
			LocateRegistry.createRegistry(1099);
			Projeto p = new Servente();
			Naming.rebind("ProjetoService", (Remote) p);
			System.out.println("Servidor em execucao");
		} catch (Exception e) {
			 System.out.println("Projeto " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ProjetoServer();
	}
}
