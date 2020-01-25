/**
 * Created by arunvyasnarayanan on 1/25/20.
 */
public class rotateMatrix {

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateCounterClock(int[][]matrix){
        int n = matrix.length;
        for(int i=0;i<Math.ceil(n/2);i++){
            for (int j = 0; j < Math.ceil(n/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = temp;
            }
        }
    }

    public static void rotateClock(int[][]matrix){
        int n = matrix.length;
        for(int i=0;i<Math.ceil(n/2);i++){
            for (int j=0;j<Math.ceil(n/2);j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printMatrix(matrix1);
        rotateCounterClock(matrix1);
        printMatrix(matrix1);
        rotateClock(matrix1);
        printMatrix(matrix1);
    }
}

