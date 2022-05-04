
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	//Construtor que recebe dia, mês e ano
	public Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Construtor completo, que recebe informações de data e horário
	public Data (int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	// Imprime a data/hora formatada (de acordo com o formato especificado)
	public void imprimir(int formato) {
		// Monta a String de impressão de data
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			// Se hora for -1, significa que os dados de horário não foram passados no construtor.
			// Então, apenas a data será exibida
			System.out.println(data);
		} else {
			//Monta parte da String da horário (deixa a hora de fora por enquanto)
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24H) {
				// Se o formato for 24h, concatena a hora no início da String (o atributo já foi
				// fornecido no formato 24h)
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				} else if (hora >= 12) {
					// Se hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter
					// a hora no formato 12h, e concatena o "PM" no fim
					horario = (hora -12) + horario;
					horario += " PM";
				} else {
					// Se a hora for menor que 12, simplesmente utiliza a própria hora e concatena
					// o "AM" no fim
					horario = hora + horario;
					horario += " AM";
				}
			}
			// Imprime a data/hora formatada
			System.out.println(data + " " + horario);
		}
	}
	
	// Métodos getters

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	
}
