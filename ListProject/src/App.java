import java.util.ArrayList; //Importando utilidades do Java. 
import java.util.List;

public class App {

	public static void main(String[] args) {
		 
		
		List lista = new ArrayList(); //List é uma interface. List permite que façamos, como o próprio nome sugere, uma lista
		
//		lista.add("AE, CASSINÃOOOOOOOOOOOOOOOOOOO");
//		lista.add(20);
//		lista.add(true);
//		
//		for(int x=0; x < lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
//		
//		System.out.println();
//		
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		
//		lista.remove(0);
//		for(Object valor : lista) {
//			System.out.println(valor);
//			
//		}
//		
//		lista.add(0, "GOTINOOOOOOOOOOO");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		lista.set(0, "JOOJ");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
		
//		lista.clear();
//		
//		if(lista.isEmpty()) {
//			System.out.println("A sua lista está vazia");
//		}
//		
		
		Conta conta1 = new Conta("Água", 60);
		Conta conta2 = new Conta("Luz", 70);
		
		List <Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		//Enhanced-for (loop "for" *aprimorado*) , também conhecido como "forEach" (para cada), é um laço de repetição.
		for(Conta conta : listaDeContas) {//Para cada (daí o "for each") variável do tipo Conta que encontrarmos *em* (representado pelo sinal ":") listaDeContas,
			//será executada a linha de comando abaixo, que pede para que seja impressa a variável do tipo Conta, exibindo as informações contidas nela.
			//O Enhanced-for faz como que uma varredura na lista de array em busca do elemento desejado.
			System.out.println(conta);
		}
		
	}

}
