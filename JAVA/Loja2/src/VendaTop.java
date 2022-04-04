import java.util.Scanner;
public class VendaTop {

	public static void main(String[] args) {
		int prod1, prod2;
		double v1, v2;
		double vT;
		double v_desc;
		int control = 0;
		
		System.out.println("Bem-vindo a Ratinho Marketplace!");
		System.out.println("________________________________");
		System.out.println("Selecione os produtos que deseja comprar:");
		System.out.println("1. Calçolas - R$20.00");
		System.out.println("2. Celso Portiolli - R$5.00");
		System.out.println("3. Camiseta Xaropinho R$50.690.000");
		System.out.println("4. Carreta transportadora aguenta 1 tonelada oloco kkkkkkkkkk - R$10.00");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Primeiro produto:");
		prod1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Segundo produto:");
		prod2 = Integer.parseInt(entrada.nextLine());
		
		if (prod1 == 1) {
			v1 = 20.00;
		}
		if (prod1 == 2) {
			v1 = 5.00;
		}
		
		
		
		
	}
	
}
