
public class App {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaCorrente();
		conta1.depositar(100);
		System.out.println(conta1.calcularSaldo());
	}

}
