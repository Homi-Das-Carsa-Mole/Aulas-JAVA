
public class App {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
		
		Ferrari ferrari = new Ferrari();
		rota.ir(ferrari);
		
		Fusca fusca = new Fusca();
		rota.ir(fusca);
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		
		automovel = new Fusca();
		rota.ir(automovel);

		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
