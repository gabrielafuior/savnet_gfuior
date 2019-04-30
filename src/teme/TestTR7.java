package teme;



public class TestTR7 {
	public static double fahrenheitToCelsius(double temperature) {
		
		double tempInCelsius = (temperature - 32) * 5 / 9;
		
		return tempInCelsius;
		
	}
     public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50));
	}
}
