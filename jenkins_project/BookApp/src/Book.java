
public class Book {
	String bookTitle;
	float bookPrice;
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "Book Title: "+this.bookTitle+"\n"+
		"Book Price: "+this.bookPrice;
	}
}
