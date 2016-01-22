import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Register {
	private ArrayList<Book> reg; // registret skall lagras i en ArrayList

	/** Skapar ett tomt register */
	public Register() {
		reg = new ArrayList<Book>();
	}

	/** Sätter in boken bok sist i Registret reg */
	public void addBook(Book bok) {
		reg.add(bok);
	}

	/** Tar bort alla böcker av en viss författare author */
	public void removeAuthor(String author1) {
		for (int i = 0; i < reg.size(); i++) {
			if (reg.get(i).getAuthor().equals(author1)) {
				reg.remove(i);
			}
		}
	}

	/**
	 * Söka upp alla böcker som gäller för en viss författare. Det skall räcka
	 * att man anger en del av författarnamnet. Samtliga böcker vars författare
	 * passar in skall presenteras med både författare och titel.
	 */
	public String print() {

		StringBuilder B = new StringBuilder();
		for (int i = 0; i < reg.size(); i++) {
			String author = reg.get(i).getAuthor();
			String title = reg.get(i).getTitle();
			B.append(author + "      " + "\n" + title + "\n");
		}
		return B.toString();
		// Skriver ut listan med hjälp av stringbuilder, tar reda på author och
		// title . skriver ut de sen med append.
	}

	public String searchAuthor(String author) {

		StringBuilder B = new StringBuilder();
		for (int i = 0; i < reg.size(); i++) {
			if (reg.get(i).getAuthor().indexOf(author) >= 0) {
				B.append(reg.get(i).getAuthor() + "      " + "\n"
						+ reg.get(i).getTitle() + "\n");
			}

		}
		return B.toString();
	}

	// Skapa en Stringbuilder, en for sats som går genom array. Om namnen skulle
	// finnas så lägger den till det
	//

	public String searchTitle(String title) {

		StringBuilder B = new StringBuilder();
		for (int i = 0; i < reg.size(); i++) {
			if (reg.get(i).getTitle().equals(title)) {
				B.append(reg.get(i).getAuthor() + "      " + "\n"
						+ reg.get(i).getTitle() + "\n");
			}

		}
		return B.toString();
	}

	public void sortByAuthor() {
		int a;
		for (int t = 0; t < reg.size(); t++) {
			a = 0;
			for (int i = 0; i < reg.size(); i++) {
				if (reg.get(t).getAuthor().toLowerCase()
						.compareTo(reg.get(i).getAuthor().toLowerCase()) > 0) {
					// tar första namnet i array o jämför med alla namn i array.
					// Varje gång namnen skulle få ett värde mindre än 0 ökar a.
					a++;
				}
			}

			Book b = reg.get(a);
			reg.set(a, reg.get(t));
			reg.set(t, b);
			// Swap där Namn på plats a blir temporär.Sedan sätt namnen som gick
			// genom först o läggs på plats a
			// . Därefter sätts temporära namnet på den plats där namnet t
			// befann sig.
			// sedan resettas a och loopen går genom igen för andra namnen tills
			// array e slut.
		}

	}

	public void sortByTitle() {
		int j;
		for (int x = 0; x < reg.size(); x++) {
			j = 0;
			for (int i = 0; i < reg.size(); i++) {
				if (reg.get(x).getTitle().compareTo(reg.get(i).getTitle()) > 0) {
					j++;
				}
			}
			Book b = reg.get(j);
			reg.set(j, reg.get(x));
			reg.set(x, b);
		}
	}

	// ... Konstruktor och alla metoderna för registerhanteringen

	/** Läser registret från filen med namn fileName. */
	public void readFromFile(String fileName) {
		// ... Se ledning för filhanteringen sist i uppgiften

		Scanner scan = null; // scanner objekt

		// Kollar om filen går att öppna. Om inte skriver ut fel och avlslutar
		// programmet
		try {
			scan = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.err.println("Filen kunde inte öppnas");
			System.exit(1);
		}

		// Hjälp variabler för författare och titel
		String author;
		String title;

		// Loopa genom hela filen. Sålänge som hasNext() == true -> finns mer
		// att läsa ur filen.
		while (scan.hasNext()) {
			author = scan.nextLine(); // på första raden författare
			title = scan.nextLine(); // på andra raden titel
			Book bok = new Book (author, title);
			addBook(bok); // lägga in bok i listan
		}

		scan.close(); // Stänga scanner
	}

	/** Sparar registret på fil med namnet fileName. */
	public void writeToFile(String fileName) {
		// ... Se ledning för filhanteringen sist i uppgiften

		PrintWriter out = null; // PrintWriter objekt

		// Kolla så filen går öppna
		try {
			out = new PrintWriter(new File(fileName));
		} catch (FileNotFoundException e) {
			System.err.println("File not found.\n");
			System.exit(1);
		}

		// Hjälpvariabel
		Book bok;

		// Loopa genom hela listan
		for (int i = 0; i < reg.size(); i++) {
			bok = reg.get(i); // plockar ut bok på plats i
			out.println(bok.getAuthor()); // Skriver ut författare på första
											// raden
			out.println(bok.getTitle()); // skriver ut titel på andra raden
		}

		out.close(); // Stänger filen
	}

}
