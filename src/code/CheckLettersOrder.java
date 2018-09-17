package code;

public class CheckLettersOrder {
	
	public boolean methodLettersOrder(String periodicElement, String symbolResult) {
		
		//System.out.println( periodicElement.lastIndexOf(symbolResult.charAt(1)) > periodicElement.indexOf(symbolResult.charAt(0)) );
		return periodicElement.lastIndexOf(symbolResult.charAt(1)) > periodicElement.indexOf(symbolResult.charAt(0));
		
		//return true;
		
	}

}
