package teme;

public class TestTR8 {
	
	public static double divide(double a, double b) {
		
		double impartire = a / b;
		
		if (b == 0) {
			System.out.println( Double.MAX_VALUE);
		}
		
		return impartire;
		
	}

	public static void main(String[] args) {
		
		System.out.println(divide(8, 0));
	}
		

	
}
