package Program_assignment5;


class BattleShip {
	
	private final int size = 20;
	private String[][] board = new String[size][size];
	
	public static void main(String args[]) {
		
		BattleShip game = new BattleShip();
		
		game.PlaceShip(2, 3, 8, "vertical");
		game.PlaceShip(6, 3, 2, "horizontal");
		game.PlaceShip(4, 7, 4, "horizontal");
		game.PlaceShip(4, 10, 4, "horizontal");
		game.PrintBoard();
		
		game.Fire(5, 7);
		game.PrintBoard();
		
	}
	
	public BattleShip() {
		CreateBoard();
	}
	
	private void CreateBoard() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				board[i][j]="0";
			}
		}
	}
	
	public void PlaceShip(int x, int y, int shiplength, String direction) {
		
		if(direction.equals("vertical")) {
			
			if(y + shiplength > size) {
				System.out.println("ship will run of the end of board, change your place");
				return;
			}
			
			for(int i=0; i< shiplength; i++) {
				
				if(board[x][y+i].equals("-")) {
					System.out.println("Invaild palcement ship cannot be overlap");
				}else {
					board[x][y+i]="-";
				}
				return;
			}
			
		}else if(direction.equals("horizontal")) {
			
			if(x + shiplength > size) {
				System.out.println("ship will run of the end of board, change your place");
				return;
			}
			
			for(int i=0; i< shiplength; i++) {
				
				if(board[x+i][y].equals("-")) {
					System.out.println("Invaild palcement ship cannot be overlap");
				}else {
					board[x+i][y]="-";
				}
				return;
			}
		}
		
	}
	
	public void PrintBoard() {
		
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				System.out.println(board[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void Fire(int x, int y) {
		
		if(board[x][y].equals("-")){
			board[x][y] = "X";
			System.out.println("Hit!");
		}else {
			board[x][y] = "?";
			System.out.println("Miss!");
		}
		
	}
	
	
}