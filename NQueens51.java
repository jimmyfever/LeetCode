import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class NQueens51 {

	public static void main(String[] args){
		
	}

	public List<List<String>> nQueens(int n){
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				board[i][j] = '.';
			}
		}
		List<List<String>> res = new ArrayList<List<String>>();
		dfs(board, 0, res);
		return res;
	}	

	private void dfs(char[][] board, int colIndex, List<List<String>> res){
		if(colIndex == board.length){
			res.add(construct(board));
			return;
		}

		for(int i = 0; i < board.length; i++){
			if(isValid(board, i, colIndex)){
				board[i][colIndex] = 'Q';
				dfs(board, colIndex + 1, res);
				board[i][colIndex] = '.';
			}
		}
	}
	private boolean isValid(char[][] board, int x, int y){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < y; j++){
				if(board[i][j] == 'Q' && (x + y == y + i || x + y == i + j || x == i)){
					return false;
				}
			}
		}
		return true;
	}
	private List<String> construct(char[][] board){
		List<String> res = new LinkedList<String>();
		for(int i = 0; i < board.length; i++){
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}
}