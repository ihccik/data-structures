package homeworks;

import java.util.Arrays;

/**
 * explanation : src/main/resources/explanations/my solution with temp array.png
 */
public class RotateArray90Degrees_MySol {
    private static int[][] matrix, matrixRotated;
    private static int n;
    public static void main(String[] args) {

        init3x3Matrix();
        printMatrix();
        rotateMatrix();
        printRotatedMatrix();

        init4x4Matrix();
        printMatrix();
        rotateMatrix();
        printRotatedMatrix();

        init5x5Matrix();
        printMatrix();
        rotateMatrix();
        printRotatedMatrix();
    }

    private static void rotateMatrix(){
        for(int i = 0; i < n; i++){
            int[] temp = new int[n];
            for(int j = 0, k= n - 1; j < n; j++, k--){
                temp[j] = matrix[k][i];
            }
            matrixRotated[i] = temp;
        }
    }

    private static void printMatrix(){
        System.out.println("****MATRIX******");
        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    private static void printRotatedMatrix(){
        System.out.println("****ROTATED MATRIX******");
        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(matrixRotated[i]));
        }
    }

    private static void init3x3Matrix(){
        n = 3;
        matrix = new int[n][n];
        matrixRotated = new int[n][n];
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;
    }

    private static void init4x4Matrix(){
        n = 4;
        matrix = new int[n][n];
        matrixRotated = new int[n][n];
        matrix[0][0] = 10; matrix[0][1] = 20; matrix[0][2] = 30; matrix[0][3] = 40;
        matrix[1][0] = 50; matrix[1][1] = 60; matrix[1][2] = 70; matrix[1][3] = 80;
        matrix[2][0] = 11; matrix[2][1] = 22; matrix[2][2] = 33; matrix[2][3] = 44;
        matrix[3][0] = 55; matrix[3][1] = 66; matrix[3][2] = 77; matrix[3][3] = 88;
    }

    private static void init5x5Matrix(){
        n = 5;
        matrix = new int[n][n];
        matrixRotated = new int[n][n];
        matrix[0][0] = 10; matrix[0][1] = 20; matrix[0][2] = 30; matrix[0][3] = 40; matrix[0][4] = 71;
        matrix[1][0] = 50; matrix[1][1] = 60; matrix[1][2] = 70; matrix[1][3] = 80; matrix[1][4] = 15;
        matrix[2][0] = 11; matrix[2][1] = 22; matrix[2][2] = 33; matrix[2][3] = 44; matrix[2][4] = 39;
        matrix[3][0] = 55; matrix[3][1] = 66; matrix[3][2] = 77; matrix[3][3] = 88; matrix[3][4] = 85;
        matrix[4][0] = 83; matrix[4][1] = 36; matrix[4][2] = 27; matrix[4][3] = 28; matrix[4][4] = 35;
    }
}
