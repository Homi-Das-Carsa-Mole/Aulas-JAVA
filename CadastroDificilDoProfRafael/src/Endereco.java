
public class Endereco {
	private String rua, bairro;
	private int num;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Endereco(String rua, int num, String bairro) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.num = num;
	}
	public Endereco() {

	}
	
	
	
}
