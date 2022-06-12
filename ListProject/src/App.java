import java.util.ArrayList; //Importando utilidades do Java. 
import java.util.List;

public class App {

	public static void main(String[] args) {
		 
		
		List lista = new ArrayList(); //"List" é uma interface. List permite que façamos o mesmo que as arrays possibilitam: armazenar valores, até mesmo
		//objetos, numa única variável, formando uma *lista*. Uma grande vantagem advinda do uso de lists é o fato de elas serem como que "elásticas", isto é,
		//terem a capacidade de adequar o seu tamanho de acordo com a quantidade de elementos que se deseja armazenar dentro delas, diferentemente de uma array
		//tradicional que, uma vez tendo seu tamanho estabelecido, este não pode ser alterado. As ArrayLists são, portanto, listas dinâmicas.
		//A ArrayList que instanciamos é uma classe que implementa em si a interface "List", possuindo métodos úteis para a criação e dinamização das listas. 
		
//		lista.add("AE, CASSINÃOOOOOOOOOOOOOOOOOOO");//Os métodos de ArrayList recebem como parâmetro qualquer variável ou elemento do tipo Object, ou seja,
		//a lista que criamos consegue armazenar qualquer coisa.
//		lista.add(20);//O ".add()" serve para adicionar o argumento colocado dentro de seu parâmetro na lista.
//		lista.add(true);
		
		
//		for(int x=0; x < lista.size(); x++) {//Iterando sobre "lista", a fim de exibir qual o índice, ou tamanho, da lista.
//			System.out.println(lista.get(x)); 
//		}
//		
//		System.out.println();
//		
		//Enhanced-For/For-Each, que já foi explicado mais abaixo:
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		
//		lista.remove(0);//Comando para remover um valor encontrado na posição 0 da lista. O "remove" exclui completamente o elemento desejado e não o substitui
		//por "null", diferentemente de uma array comum.
//		for(Object valor : lista) {
//			System.out.println(valor);
//			
//		}
//		
		//Se já existe um valor na posição 0 e desejamos adicionar outro valor para essa posição, o método "add" tem a capacidade de empurrar o valor do
		//índice 0 para o índice 1.
//		lista.add(0, "GOTINOOOOOOOOOOO");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		lista.set(0, "JOOJ");//O método "set" substitui/sobrescreve, sem "empurrar" para outro espaço, o elemento que está na posição especificada no
		//primeiro argumento do parâmetro, no caso o índice 0, pelo valor inserido no segundo argumento do parâmetro, que é o "JOOJ".  
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
		
//		lista.clear();//O método "clear" limpa toda a lista.
//		
//		if(lista.isEmpty()) {//O método "isEmpty" serve para averiguar se uma lista está vazia ou não. Usamos um teste condicional "if" para que, se a lista
		//estiver vazia, seja exibida uma mensagem no console informando isso.
//			System.out.println("A sua lista está vazia");
//		}
//		
		
		Conta conta1 = new Conta("Água", 60);
		Conta conta2 = new Conta("Luz", 70);
		
		//Instanciando uma lista que só armazenará objetos do tipo "Conta":
		List <Conta> listaDeContas = new ArrayList<Conta>();
		
		//Adicionando os objetos "conta1" e "conta2" para a "listaDeContas"
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		//Enhanced-for (loop "for" *aprimorado*) , também conhecido como "forEach" (para cada), é um laço de repetição.
		for(Conta conta : listaDeContas) {//Para cada (daí o "for each") variável do tipo Conta que encontrarmos *em* (representado pelo sinal ":") 
			//listaDeContas, será executada a linha de comando abaixo, que pede para que seja impressa a variável "conta", que agora tem atribuída a si
			//todas as informações contidas em "listaDeContas".
			//O Enhanced-for faz como que uma varredura na lista de array em busca do elemento desejado.
			System.out.println(conta);
		}
		
	}

}
