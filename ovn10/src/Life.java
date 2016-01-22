public class Life {
	private LifeBoard board;

	Life(LifeBoard board) {

		this.board = board; // Spara board
	}

	public void newGeneration() {

		board.increaseGeneration();

		int neighbours = 0; // counter

		boolean[][] temp = new boolean[board.getRows()][board.getCols()];
		/*
		 * temp matris som sparar nästa gen. detta för vi inte kan göra
		 * ändringar samtidigt som vi räknar måste räkna allas grannar innan det
		 * föds/dör.
		 */

		// Loopar genom hela matrisen
		for (int row = 0; row < board.getRows(); row++) {
			for (int col = 0; col < board.getCols(); col++) {

				// kolla antalet grannar på plats (row, col).
				neighbours = getNeighbours(row, col);

				// Om individen är levande:
				if (board.get(row, col) == true) {

					// Denna kollar - individ levande:
					// om grannar < 2 eller >= 4 så dör man!
					if (neighbours < 2 || neighbours >= 4) {
						temp[row][col] = false;
					} else {
						// annars ska individen fortsätta leva!
						temp[row][col] = true;
					}

				} else {
					// Rutan är död från början

					// Om grannar är exakt 3 st.
					if (neighbours == 3) {
						temp[row][col] = true;
					}
				}

			}
		}
		// uppdatera board med den nya matrisen
		board.matris = temp;
	}

	private int getNeighbours(int row, int col) {

		int neighbours = 0; // Räkna grannar!

		// yttre Loopen, Loopar raderna
		for (int r = row - 1; r <= row + 1; r++) {

			// Inre loop. Loopar kolonnerna
			for (int c = col - 1; c <= col + 1; c++) {

				// Här inne kollar vi om det finns en granne.
				// Om granne finns - uppdatera

				// Vill inte räkna med sig själv. Hoppa över
				if (r == row && c == col) {
					continue;
				}

				if (board.get(r, c) == true) {
					neighbours++;
				}
			}
		}

		return neighbours;
	}

	/*
	 * flippar värdet på plats (row, col) om true -> false om false -> true
	 */
	public void flip(int row, int col) {

		if (board.get(row, col) == true) {

			board.put(row, col, false);

		} else {

			board.put(row, col, true);
		}

	}

}