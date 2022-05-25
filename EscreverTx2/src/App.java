import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		
		Sabonete s1 = new Sabonete();
		Sabonete s2 = new Sabonete();
		Sabonete s3 = new Sabonete();
		
		s1.setCheiro("Orquídea");
		s1.setCor("Roxo");

		s2.setCheiro("Limão");
		s2.setCor("Verde");
		
		s3.setCheiro("Barbie Kill");
		s3.setCor("vermeio??????????");
		
		List <Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();
		
		listaDeSabonetes.add(s1);
		listaDeSabonetes.add(s2);
		listaDeSabonetes.add(s3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("sabonetes.txt"))){
			
			for(Sabonete sabs : listaDeSabonetes) {
				escrever.write(sabs.toString());
			}
		}
		

		

	}

}
