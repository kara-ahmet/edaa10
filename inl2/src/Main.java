public class Main {
	public static void main(String[] args) {
		Dialog d = new Dialog();
		Register reg = new Register();
		while (true) {
			String menuItems = "Meny" + "\n"
		            + "1: Sätt in en ny bok" + "\n"
					+ "2: Tag bort böcker" + "\n"
					+ "3: Sök titel från en författare" + "\n"
					+ "4: Sök titel från alla författare" + "\n"
					+ "5: Presentera alla böcker sorterade efter författare" + "\n"
					+ "6: Presentera alla böcker sorterade efter titel" + "\n"
					+ "7: Spara registret på en fil" + "\n"
					+ "8: Hämta uppgifterna till registret från en fil" + "\n"
					+ "0: Avsluta" + "\n";
			int a = d.readInt(menuItems);
			switch (a) {

			case 1:
				String author = "Ange författare";
				String title = "Ange boktitel";
				Book b = new Book(d.readString(author), d.readString(title));
				reg.addBook(b);
				d.printString(reg.print());

				break;
			case 2:
				String remove = "Ange författare";
				reg.removeAuthor(d.readString(remove));
				d.printString(reg.print());

				break;
			case 3:
				String author1 = "Ange författare";
				d.printString(reg.searchAuthor(d.readString(author1)));

				break;

			case 4:
				String title1 = "Ange boktitel";
				d.printString(reg.searchTitle(d.readString(title1)));
				break;

			case 5:
				reg.sortByAuthor();
				d.printString(reg.print());
				break;

			case 6:
				reg.sortByTitle();
				d.printString(reg.print());
				break;
			case 7:
				String fileName = "Ange filnamn";
				d.readString(fileName);
				reg.writeToFile(fileName);
				break;

			case 8:
				String filename = "Ange filnamn";
				d.readString(filename);

				reg.readFromFile(filename);
				break;

			case 9:
				d.printString(reg.print());
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}
}
