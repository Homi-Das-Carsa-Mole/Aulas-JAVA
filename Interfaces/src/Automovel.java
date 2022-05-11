
public interface Automovel {
	//Interface: intermed�ario. Exemplo: um DVD tem uma interface padr�o, com bot�es de play, pause, avan�ar, voltar, etc. Quando apertamos esses bot�es, n�o nos preocupamos com o que acontece internamente no DVD
		//Na interface n�o existem c�digo algum. Nela ser�o implementados os m�todos de outra classe.
		//Uma mesma classe pode ter v�rias interfaces.
		//Assim como na classe abstrata, quando uma classe se conecta a uma interface, � preciso implementar na classe os m�todos e atributos da interface.
	
	void virarEsquerda();
	void virarDireita();
	void acelerar();

}
