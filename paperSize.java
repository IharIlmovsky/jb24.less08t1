package by.epam.jb24.less08.htask;

public class paperSize {
	
	private int paperWidth; // формат издания  150х225 мм
	private int paperHeight;
	
	public paperSize( int aWidth, int aHeight) {
		setPaperWidth(aWidth);
		setPaperHeight(aHeight);
	}
	
	public int getPaperWidth() {
		return paperWidth;
	}
	public void setPaperWidth(int paperWidth) {
		this.paperWidth = paperWidth;
	}
	public int getPaperHeight() {
		return paperHeight;
	}
	public void setPaperHeight(int paperHeight) {
		this.paperHeight = paperHeight;
	}

}
