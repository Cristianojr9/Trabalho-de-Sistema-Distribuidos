import java.rmi.Naming;
import java.util.Scanner;

public class ProjetoClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			Projeto p = (Projeto) Naming.lookup("rmi://127.0.1.1/ProjetoService");
			String escolha = "1";
			while(!escolha.equals("0")) {
				System.out.println("Digite o valor para a conversão: ");
				int a = entrada.nextInt();
				System.out.println("Escolha uma das opções abaixo: ");
				System.out.println("1 - Converter de Real Brasileiro para Dolár Americano");
				System.out.println("2 - Converter de Real Brasileiro para Euro");
				System.out.println("3 - Converter de Real Brasileiro para Libra Esterlina");
				System.out.println("4 - Converter de Dólar Americano para Real Brasileiro");
				System.out.println("5 - Converter de Euro para Real Brasileiro");
				System.out.println("6 - Converter de Libra Esterlina para Real Brasileiro");
				escolha = entrada.next();
				switch (escolha){
					case "1":
						System.out.println(a + " Real Brasileiro " + "igual a " + p.reaisToDolar(a) + " Dólar Americano");
						break;
					case "2":
						System.out.println(a + " Real Brasileiro " + "igual a " + p.reaisToEuro(a) + " Euro");
						break;
					case "3":
						System.out.println(a + " Real Brasileiro " + "igual a " + p.reaisToLibra(a) + " Libra Esterlina");
						break;
					case "4":
						System.out.println(a + " Dólar Americano " + "igual a " + p.dolarToReais(a) + " Real Brasileiro");
						break;
					case "5":
						System.out.println(a + " Euro " + "igual a " + p.euroToreais(a) + " Real Brasileiro");
						break;
					case "6":
						System.out.println(a + " Libra " + "igual a " + p.libraToreais(a) + " Real Brasileiro");
						break;
				}
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}