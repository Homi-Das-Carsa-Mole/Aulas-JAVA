
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
		
		System.out.println("O valor do primeiro produto � de R$" + prod1);
		System.out.println("O valor do segundo produto � de R$" + prod2);
		System.out.println("O valor total da compra � de R$" + vT);
		System.out.println("O valor com desconto � de R$" + v_desc);
		
	}

}
