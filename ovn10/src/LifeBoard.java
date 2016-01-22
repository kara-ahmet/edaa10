public class LifeBoard {

	private int generation;
	private int rows;
	private int cols;
	public boolean[][] matris;

	/**
	 * Skapar en spelplan med rows rader och cols kolumner. Spelplanen är från
	 * början tom, dvs alla rutorna är tomma och generationsnumret är 1.
	 */
	public LifeBoard(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		matris = new boolean[rows][cols];
		generation = 1;
	}

	/**
	 * Ger true om det finns en individ i rutan med index row, col, false
	 * annars. Om index row, col är utanför spelplanen returneras false
	 */
	public boolean get(int row, int col) {

		if (row >= rows || col >= cols || col < 0 || row < 0) {
			return false;
		}
		if (matris[row][col] == true) {
			return true;
		} else {
			return matris[row][col];
		}
	}

	/** Lagrar värdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {

		matris[row][col] = val;
	}

	/** Tar reda på antalet rader */
	public int getRows() {

		return rows;
	}

	/** Tar reda på antalet kolumner */
	public int getCols() {

		return cols;
	}

	/** Tar reda på aktuellt generationsnummer */
	public int getGeneration() {

		return generation;
	}

	/** Ökar generationsnumret med ett */
	public void increaseGeneration() {

		generation++;
	}
}