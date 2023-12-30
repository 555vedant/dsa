public class multiplicationoftwodmatrix {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] m1 = {{1, 0, 1}, {0, 1, 1}, {0, 1, 1}};
        int[][] m2 = {{1, 1, 1}, {0, 1, 1}, {0, 1, 0}};
        int[][] nm = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    nm[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nm[i][j] + " ");
            }
            System.out.println();
        }
    }
}


