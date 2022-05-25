public class Sabonete {
	
	private String cheiro;
	private String cor;
	
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor + "\n";
	}

	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	public Sabonete(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(","); //O "split" quebra a linha de texto quando encontra o caractere especificado
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim(); //O "trim" serve para limpar os espacos vazios ao redor do valor que desejamos isolar
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}
	

	
	
	
}