package teme;

public class TestBA1 {

	 public static double avg(int[] sir) {
		 
		// int [] sirDeNumereIntregi = new int[2];
		//int sum = ;
		 
		 double media =  sum / sir.length;
		 
	     for (int i = 0; i < sir.length; i++) {
	    	
	    	
			sum +=sir[i];
		
			
		}
		return media;
		
		
	 }
	public static void main(String[] args) {
		
		System.out.println(avg(new int[] {1,2}));
		
	
	} 
}
		 
		 