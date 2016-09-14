package com.brainacad.laboratotys2_2;



import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Таня on 10.09.2016.
 * Create class Matrix with 2D array (int, size 2x2) field and methods: addition and multiplication of matrices;
 */
class Matrix {
    private int[][] matrix = new int[2][2];

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void fillMatrix() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
    }

    public int[][] addition(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplication(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix ){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
    }
}

public class Laboatory2_2_1 {

}
