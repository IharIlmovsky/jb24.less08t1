package by.epam.jb24.less08.htask;

public class bookFont { //Шрифтовое оформление

	private String fontName;	// гарнитура
	private int fontSize;	    // кегль набора, пт	
	private int fontSpace;      //  пт.
	
	public bookFont(String afontName, int afontSize, int afontSpace) {
		setFontName(afontName);
		setFontSize(afontSize);
		setFontSpace(afontSpace);
	}
	
	public String getFontName() {
		return fontName;
	}
	public void setFontName(String fontName) {
		this.fontName = fontName;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public int getFontSpace() {
		return fontSpace;
	}
	public void setFontSpace(int fontSpace) {
		this.fontSpace = fontSpace;
	}
	
}
