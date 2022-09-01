import java.util.Arrays;

public class MatrixTraversal {

    public int diagnalSum (int[] [] matrix ) {
        int arrLen = matrix.length;
        int sum = 0;
        for (int i = 0; i < arrLen; i++) {
            sum += matrix[i][i]+matrix[i][arrLen - i - 1];
        }
        if (arrLen % 2 == 1) {
            sum -= matrix[arrLen / 2] [arrLen / 2];
        }
        System.out.println("Sum: \n" + sum);
        return sum;
    }

    public int[][] spiralMatrix (int n) {
        // row
        int r1=0;
        int r2=n-1;
        int c1 = 0;
        int c2 = n-1;
        int [][] arr = new int[n][n];
        int move = 1;

        while(r1 <= r2 && c1 <= c2) {
            // left to right
            for(int c = c1; c <= c2; c++) {
                arr[r1][c]=move++;
            }
            // move down
            for (int r = r+1; r <= r2; r++) {
                arr[r][c2]=move++;
            }

            // segue to bottom [r-l and  traversal to top (left to up)
            if (r1<r2 && c1<c2) {
                for (int c = c2-1; c >= c1; c--) {
                    arr[r2][c]=move++;
                }
                // move up
                for (int r = r2-1; r >= r1; r--) {
                    arr[r][c1]=move++;
                }
                r1++;
                r2--;
                c1++;
                c2--;
            }

        }
        System.out.println("Spiral Matrix: \n" + Arrays.deepToString(arr));
        return arr;
    }
}
