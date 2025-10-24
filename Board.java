import java.util.Arrays;

public class Board {
	int[][] guesses;
	int[][] ships;
	
	public Board() {
		guesses = new int[10][10];
		ships = new int[10][10];
	}
	
	public void printBoard() {
		String[] ships = {"- "};
	//makes sure that there are 10 rows
		for (int i = 0; i < 10; i++) {
		//prints out the rows
			for (int j = 0; j < 10; j++) { 
				String row = (Arrays.toString(ships));
				System.out.print(row.substring(1, row.length() - 1));
			}
			System.out.println("");
		}
	}
}



//public String toString() {
	//retur

public boolean placeShips(int row, int col int len, boolean horizontal) {
/*
ask for a specific spot on the board and mkae sure it is valid

ask if this is where they want to place their ship and wait for a yes or no

board is reprinted with ship placement

goes onto next ship to place
*/
}
