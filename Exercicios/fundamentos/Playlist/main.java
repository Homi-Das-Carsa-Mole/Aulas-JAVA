package Playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		List <Musica> playlistEscrita = new ArrayList <Musica>();
		List <Musica> playlistLeitura = new ArrayList <Musica>();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao seu gerador de playlist! \nQuantas m�sicas a sua playlist ter�?");
		int qtde = entrada.nextInt();
		
		for (int x = 0; x <= qtde; x++) {
			
			Musica musica = new Musica();
			
			System.out.println("Digite o nome da m�sica: \nATEN��O: se o nome da m�sica for composto de mais de uma palavra, n�o utilize a barra de espa�o para separar as palavras."
			+ "\nRecomendamos que fa�a a distin��o entre as palavras atrav�s do uso de underline ou de iniciais com letra mai�scula.");
			musica.setNome(entrada.next());
			
			System.out.println("Digite o nome do artista/banda que a produziu:");
			musica.setNome(entrada.next());
			
			System.out.println("Escolha o g�nero da m�sica:");
			System.out.println("1. AX� | 2. BLUES | 3. COUNTRY | 4. ELETR�NICA | 5. FORR� \n"
					+ "6. FUNK | 7. GOSPEL | 8. HIP HOP | 9. JAZZ \n"
					+ "10. MPB | 11. M�SICA CL�SSICA | 12. PAGODE | 13. POP | 14. RAP \n"
					+ "15. REGGAE | 16. ROCK | 17. SAMBA | 18. SERTANEJO");
			
			
			int opcao = 0;
			while (opcao < 1 || opcao > 18) {
				opcao = entrada.nextInt();
				switch (opcao) {
					case 1:
						musica.setGenero(Genero.AX�);
						break;
					case 2:
						musica.setGenero(Genero.BLUES);
						break;
					case 3:
						musica.setGenero(Genero.COUNTRY);
						break;
					case 4:
						musica.setGenero(Genero.ELETR�NICA);
						break;
					case 5:
						musica.setGenero(Genero.FORR�);
						break;
					case 6:
						musica.setGenero(Genero.FUNK);
						break;
					case 7:
						musica.setGenero(Genero.GOSPEL);
						break;
					case 8:
						musica.setGenero(Genero.HIP_HOP);
						break;
					case 9:
						musica.setGenero(Genero.JAZZ);
						break;
					case 10:
						musica.setGenero(Genero.MPB);
						break;
					case 11:
						musica.setGenero(Genero.M�SICA_CL�SSICA);
						break;
					case 12:
						musica.setGenero(Genero.PAGODE);
						break;
					case 13:
						musica.setGenero(Genero.POP);
						break;
					case 14:
						musica.setGenero(Genero.RAP);
						break;
					case 15:
						musica.setGenero(Genero.REGGAE);
						break;
					case 16:
						musica.setGenero(Genero.ROCK);
						break;
					case 17:
						musica.setGenero(Genero.SAMBA);
						break;
					case 18:
						musica.setGenero(Genero.SERTANEJO);
						break;
					default:
						System.out.println("G�nero indispon�vel");
				}
			}
			
			System.out.println("Copie a URL da m�sica e a insira agui.");
			musica.setUrl(entrada.next());
			
			playlistEscrita.add(musica);
		
		}

	}

}
