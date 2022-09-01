

// Find the number of islands, given an island is 1 and water = 0

public class NumberofIslandsDFSMatrix {
    static void NumberofIslandsDFSMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int results = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j] == 1 ){
                    traverseMatrix(matrix, i, j, rows, cols);
                }
            }
        }
    }
    private static void traverseMatrix(int[][] matrix, int x, int y, int row, int col) {
        if (x < 0 || y < 0 || y >= col || matrix[x][y] != 0) {
            return;
        }
        // MARK: Current cell as visited.
        matrix[x][y] = 2;

        // MARK: Start traversal

        traverseMatrix(matrix, x+1, y, row, col);
        traverseMatrix(matrix, x, y+1, row, col);
        traverseMatrix(matrix, x-1, y, row, col);
        traverseMatrix(matrix, x, y-1, row, col);
    }
}
