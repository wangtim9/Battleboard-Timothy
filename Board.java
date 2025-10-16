public class Board {
	int[][] guesses;
	int[][] ships;
	
	public Board() {
		guesses = new int[10][10];
		ships = new int[10][10];
	}
	
	public void printBoard() {
	//makes sure that there are 10 rows
		for (int i = 0; i < 10; i++) {
		//prints out the rows
			for (int j = 0; j < 10; j++) { 
				System.out.print(ships[i][j]);
			}
		}
	}
}

//public String toString() {
	//return 
	
