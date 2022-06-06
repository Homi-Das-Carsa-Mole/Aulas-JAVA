
public interface Automovel {
	
	//Interface: intermedíario. Exemplo: um DVD tem uma interface padrão, com botões de play, pause, avançar, voltar, etc. Quando apertamos esses botões, não nos preocupamos com o que acontece internamente no DVD
	//Na interface não se elabora código algum. Nela serão inseridos apenas a assinatura dos métodos que as classes que a implementarem farão uso.
	//Para que uma classe faça uso de uma interface, é preciso explicitar que desejamos implementar na classe em questão a interface desejada.
	//Uma mesma classe pode ter várias interfaces.
	//Assim como na classe abstrata, quando uma classe se conecta a uma interface, é preciso implementar na classe os métodos e atributos da interface.
	
	void virarEsquerda();
	void virarDireita();
	void acelerar();

}
