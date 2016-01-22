public class LifeController {

	public static void main(String[] args) {
		LifeBoard board = new LifeBoard(20, 20);
		LifeView window = new LifeView(board);

		// ritar board
		window.drawBoard();

		// variabel som kollar commander
		int commander = 0;

		// Life objekt som ska styra Life-sakerna

		Life life = new Life(board);

		while (true) {
			/* bestämmer vad som händer beroende på vilket värde commander har. */

			commander = window.getCommand();

			if (commander == 1) {
				// genom klick ändrar så individer lever/dör

				life.flip(window.getRow(), window.getCol());

			} else if (commander == 2) {

				life.newGeneration();
				// nästa generation

			} else if (commander == 3) {

				System.exit(0);
				// kollar om vi trycker på "quit"
			}

			window.update();
		}
	}
}