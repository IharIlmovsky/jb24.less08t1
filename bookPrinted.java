package by.epam.jb24.less08.htask;

public class bookPrinted extends basePrinted {
  
	private String typeOfBook;
	private bookFont[] bFonts;  //Шрифтовое оформление
	private int yearPrinted;
		
	public bookPrinted(String _title, 
			           String _typeOfBook, 
			           boolean aIllustrated, paperSize apSize, 
			           int aVolume,	bookFont[] bFonts, int aYear) {
		super(_title, false, aIllustrated, 
			   apSize, aVolume); 

		setbFonts(bFonts);
		setTypeOfBook(_typeOfBook);
		setYearPrinted(aYear);
	}	
	
	public void typeBookDetails( boolean isLF) {
		typePrintedDetails( isLF);
		System.out.printf("BookType: '%s', Year: %d",
				           typeOfBook, yearPrinted);
	}
	
	public String getTypeOfBook() {
		return typeOfBook;
	}

	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}

	public bookFont[] getbFonts() {
		return bFonts;
	}

	public void setbFonts(bookFont[] bFonts) {
		this.bFonts = bFonts;
	}

	public int getYearPrinted() {
		return yearPrinted;
	}

	public void setYearPrinted(int yearPrinted) {
		this.yearPrinted = yearPrinted;
	}
}
