public class Pessoa {
	String nome;
	int NumFigurinhas;

	void receber(int NumFigurinhas) {
		this.NumFigurinhas += NumFigurinhas;
	}

	boolean dar(int NumFigurinhas, Pessoa pessoa) {
		//boolean retorno;

		if (this.NumFigurinhas < NumFigurinhas) {
			System.out.println("Não é possível dar; número de figurinhas insuficiente.");
			//retorno = false;
			return false;
		}
		else {
			this.NumFigurinhas -= NumFigurinhas;
			pessoa.receber(NumFigurinhas);
			//retorno = true;
			return true;
		}
		//return retorno;
	}
}
