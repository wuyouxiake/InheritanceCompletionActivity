public class Book extends Product {
	private String author;

	public Book() {
		super();
		;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public int getCount() {
		int count = super.getCount();
		count++;
		return count;
	}

	@Override
	public String toString() {
		return super.toString() + "Author: " + author + "\n";
	}
}