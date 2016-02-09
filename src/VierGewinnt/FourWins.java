package VierGewinnt;

public class FourWins {

	private int sizeX;
	private int sizeY;
	private char[][] array;

	public FourWins(int sizeX, int sizeY) {
		array = new char[sizeX][sizeY];
		this.sizeX = sizeX;
		this.sizeY = sizeY;

		for (int x = 0; x < sizeX; x++) {
			for (int y = 0; y < sizeY; y++) {
				array[x][y] = ' ';
			}
		}
	}

	public boolean playerA(int x, int y) {
		if (array[x][y] == ' ') {
			array[x][y] = 'A';
			return true;
		}

		return false;
	}

	public boolean playerB(int x, int y) {
		if (array[x][y] == ' ') {
			array[x][y] = 'B';
			return true;
		}

		return false;
	}

	private char fourInRow() {
		int countA = 0;
		int countB = 0;

		for (int y = 0; y < sizeY; y++) {
			countA = 0;
			countB = 0;
			for (int x = 0; x < sizeX; x++) {
				if (array[x][y] == ' ') {
					countA = 0;
					countB = 0;
				}
				if (array[x][y] == 'A') {
					countA++;
					countB = 0;
					if (countA >= 4)
						return 'A';
				}
				if (array[x][y] == 'B') {
					countB++;
					countA = 0;
					if (countB >= 4)
						return 'B';
				}
			}
		}

		return ' ';
	}

	private char fourInColumn() {
		int countA = 0;
		int countB = 0;

		for (int x = 0; x < sizeX; x++) {
			countA = 0;
			countB = 0;
			for (int y = 0; y < sizeY; y++) {
				if (array[x][y] == ' ') {
					countA = 0;
					countB = 0;
				}
				if (array[x][y] == 'A') {
					countA++;
					countB = 0;
					if (countA >= 4)
						return 'A';
				}
				if (array[x][y] == 'B') {
					countB++;
					countA = 0;
					if (countB >= 4)
						return 'B';
				}
			}
		}

		return ' ';
	}

	public char winner() {
		if (fourInRow() != ' ') {
			return fourInRow();
		} else {
			return fourInColumn();
		}

	}
}
