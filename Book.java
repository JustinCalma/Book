public class Book {
	private String author;
	private String title;
	private int pages;
	
	public Book (String userTitle, String userAuthor) {
		author = userAuthor;
		title = userTitle;
	}
	
	public Book (String userTitle, String userAuthor, int userPages) {
		author = userAuthor;
		title = userTitle;
		pages = userPages;
	}
	
	public String info() {
		return title + " written by " + author + " containing " + pages + " pages";
	}
}