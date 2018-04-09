package by.epam.jb24.less08.htask;

public class basePrinted {

	private String title;
	private boolean isPeriodical;
	private boolean isIllustrated;
	private paperSize pSize;// paperSize
	private int printedVolume; //Тираж издания 
	
	public basePrinted(String _title, boolean aPeriodical, 
			           boolean aIllustrated, paperSize apSize, int aVolume) {
		
		setTitle(_title);
		setPeriodical(aPeriodical);
		setIllustrated(aIllustrated);
		setpSize(apSize);
		setPrintedVolume(aVolume);
	}
	
	public void typePrintedDetails(boolean isLF ) {
		
		String fmtStr = "Title: '%s', size: %d:%d volume: %d";
		if (isLF) {
			fmtStr = fmtStr + "\n"; 
		}
		System.out.printf(fmtStr,
				          title, 
				          pSize.getPaperWidth(), pSize.getPaperHeight(),
				          getPrintedVolume() );
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String _title) {
		this.title = _title;
	}
	public boolean isPeriodical() {
		return isPeriodical;
	}
	public void setPeriodical(boolean isPeriodical) {
		this.isPeriodical = isPeriodical;
	}
	public boolean isIllustrated() {
		return isIllustrated;
	}
	public void setIllustrated(boolean isIllustrated) {
		this.isIllustrated = isIllustrated;
	}
	public paperSize getpSize() {
		return pSize;
	}
	public void setpSize(paperSize apSize) {
		this.pSize = apSize;
	}
	public int getPrintedVolume() {
		return printedVolume;
	}
	public void setPrintedVolume(int pVolume) {
		this.printedVolume = pVolume;
	}
	
}