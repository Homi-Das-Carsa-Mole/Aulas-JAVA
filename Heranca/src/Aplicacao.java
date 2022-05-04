
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2013);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
	
		carro.setMarca("Honda");
		carro.setModelo("Fit");
		carro.setAno(2014);
		carro.setQuatroPortas(true);
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("SCANIA");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		
		System.out.println();
		
		moto.buzinar();
		moto.cortarDeGiro();
		moto.empinar();
	}

}
