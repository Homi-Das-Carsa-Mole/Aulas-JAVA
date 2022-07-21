package Playlist;

public class Musica {
	private String nome, artista, url;
	private Genero genero;
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getArtista() {
		return artista;
	}



	public void setArtista(String artista) {
		this.artista = artista;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	@Override
	public String toString() {
		return "Nome: " + nome + ", Artista/Banda: " + artista + ", Gênero musical: " + genero + ", URL" + url + "]";
	}



	
}
