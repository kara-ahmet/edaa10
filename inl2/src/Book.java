public class Book {
	private String title; // titel
	private String author; // författare

	/** Skapar en bok med författaren author och titeln title */
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	/** Returnerar namnet på författaren */
	public String getAuthor() {
		return author;
	}

	/** Returnerar titeln */
	public String getTitle() {
		return title;
	}

	/** Returnerar en sträng som består av bokens författare och titel */
	public String toString() {
		return author + "\t" + title;
	}
}