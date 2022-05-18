import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//List é uma interface
		
		List lista = new ArrayList();
		
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
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
	}

}
