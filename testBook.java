package by.epam.jb24.less08.htask;

public class testBook {

	public static void main(String[] args) {
		
		basePrinted thePrt = new basePrinted("ISSN 2001-2 429164",
		                                      false, false, 
		                      new paperSize(160, 240), 24);
		
		bookFont[] arrayFonts = {new bookFont("Arial", 12, 18)}; 
		bookPrinted book = new bookPrinted ("Land of Oz", 
		                                    "natural popular", 
		                        true, new paperSize(200,380), 
		                        45000,	arrayFonts, 2016);
		
		thePrt.typePrintedDetails(true);
		book.typeBookDetails(true);
	}

}
