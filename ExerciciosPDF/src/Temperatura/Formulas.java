package Temperatura;

public class Formulas {
	
	public double toKelvin (double temperatura) {
		return temperatura + 273.5;
	}
	
	public double toReaumur (double temperatura) {
		return temperatura * 0.8;
	}
	
	public double toRankine (double temperatura) {
		return temperatura * 1.8 + 32 + 459.67; 
	}
	
	public double toFahrenheit (double temperatura) {
		return temperatura * 1.8 + 32;
	}
	
	
	
}
