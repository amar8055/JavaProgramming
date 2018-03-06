  package BookClass;

public class BookClass {

	private String title;
	private int isbncode;
	private String authorname;
	private int price;
	
	public  BookClass( )
	{
		}
	public BookClass(String title, int isbncode, String authorname, int price)
	{
		this.title=title;
		this.isbncode=isbncode;
		this.authorname=authorname;
		this.price=price;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbncode() {
		return isbncode;
	}

	public void setIsbncode(int isbncode) {
		this.isbncode = isbncode;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
