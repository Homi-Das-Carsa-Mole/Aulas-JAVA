
public class Venda {

	public static void main(String[] args) {
		double prod1;
		double prod2;
		double vT;
		double v_desc;

		prod1 = 700.00;
		prod2 = 100.00;
		vT = prod1 + prod2;
		v_desc = vT * 0.85;
		
		System.out.println("O valor do primeiro produto é de R$" + prod1);
		System.out.println("O valor do segundo produto é de R$" + prod2);
		System.out.println("O valor total da compra é de R$" + vT);
		System.out.println("O valor com desconto é de R$" + v_desc);
		
	}

}
