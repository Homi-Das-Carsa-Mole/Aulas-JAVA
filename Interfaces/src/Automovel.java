
public interface Automovel {
	//Interface: intermedíario. Exemplo: um DVD tem uma interface padrão, com botões de play, pause, avançar, voltar, etc. Quando apertamos esses botões, não nos preocupamos com o que acontece internamente no DVD
		//Na interface não existem código algum. Nela serão implementados os métodos de outra classe.
		//Uma mesma classe pode ter várias interfaces.
		//Assim como na classe abstrata, quando uma classe se conecta a uma interface, é preciso implementar na classe os métodos e atributos da interface.
	
	void virarEsquerda();
	void virarDireita();
	void acelerar();

}
