package Week4;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the rows: ");
        row = sc.nextInt();
        col = row;
        int [][] matrix1 = new int[row][col];
        int [][] matrix2 = new int[row][col];
        System.out.println("Enter the elements for 1st matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++)
                matrix1 [i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements for 2nd matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++)
                matrix2 [i][j] = sc.nextInt();
        }
        int [][] result = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col ; j++){
                for (int k = 0; k<row;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication: ");
        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}