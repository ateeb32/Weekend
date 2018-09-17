package code;

public class MainClass {
	
	CheckLength checkLength = new CheckLength(); // Calls the CheckLength class
	CheckLetters checkLetters = new CheckLetters(); // Calls the CheckLetters class
	CheckLettersOrder checkOrder = new CheckLettersOrder(); // Calls the CheckLettersOrder class
	
	public boolean partOne(String periodicElement, String symbolResult) {
		
		periodicElement = periodicElement.toLowerCase(); // Switch the whole of the element name into lowercase
        symbolResult = symbolResult.toLowerCase(); // Switch the whole of the symbol name into lowercase
        
        if (periodicElement == null || periodicElement.isEmpty() || symbolResult == null || symbolResult.length() != 2) {
        	
        	return false;
        
        }
        
        boolean finalResult = checkLength.methodLength(symbolResult) && checkLetters.methodLetters(periodicElement, symbolResult) && checkOrder.methodLettersOrder(periodicElement, symbolResult);
        
        System.out.println(finalResult);
        return finalResult;
		
	}

}
