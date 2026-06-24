package Day51;

public class SurroundedRegions {

    static void dfs(
            char[][] board,
            int row,
            int col) {

        if (row < 0
                || col < 0
                || row >= board.length
                || col >= board[0].length
                || board[row][col] != 'O') {

            return;
        }

        board[row][col] = '#';

        dfs(board, row + 1, col);
        dfs(board, row - 1, col);
        dfs(board, row, col + 1);
        dfs(board, row, col - 1);
    }

    public static void main(String[] args) {

        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {

            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {

            dfs(board, 0, j);
            dfs(board, rows - 1, j);
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 'O') {

                    board[i][j] = 'X';

                } else if (
                        board[i][j] == '#') {

                    board[i][j] = 'O';
                }
            }
        }

        System.out.println(
                "Regions Captured"
        );
    }
}