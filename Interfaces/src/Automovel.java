
public interface Automovel {
	
	/*
	Interface: intermedíario. Exemplo: um DVD tem uma interface padrão, com botões de play, pause, avançar, voltar, etc. Quando apertamos esses botões, não nos
	preocupamos com o que acontece internamente no DVD para que a função escolhida seja executada. Utilizamos desses botões apenas sabendo para o que servem, mas
	não como funcionam. Da mesma forma, a interface, em Java, é como o local onde os botões de um DVD se dispõem, e esses botões, por sua vez representam os métodos
	que definimos, dizendo apenas o que é feito, mas não como é feito. A forma como um método de uma interface funcionará é especificada, através de um Override, dentro
	das classes que implementam essa interface.
	*/
	
	//Na interface não se elabora código algum. Nela serão inseridos apenas as assinaturas dos métodos que as classes que a implementarem farão uso.
	//Para que uma classe faça uso de uma interface, é preciso explicitar que desejamos implementar na classe em questão a interface desejada.
	//Uma mesma classe pode ter várias interfaces.
	//Assim como na classe abstrata, quando uma classe se conecta a uma interface, é preciso implementar na classe os métodos e atributos da interface.
	
	void virarEsquerda();
	void virarDireita();
	void acelerar();

}
