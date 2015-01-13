
public class TestBook {
	
	static Book b[];
	public static void createBook()
	{
		b = new Book[3];
		
		for ( int i = 0; i < 3; ++i)
		{
			b[i] = new Book();
			b[i].setBookTitle("Let Us C");
			b[i].setBookPrice(200.00f);
		}
	}
	
	public static void showBook()
	{
		for ( int i = 0; i < 3; ++i)
		{
			System.out.println(b[i].toString());
		}
	}
	
	public static void main(String[] args) {
		createBook();
		showBook();
		
		TestBook tt = new TestBook();
		tt.createBook();
		tt.showBook();
	}
}
