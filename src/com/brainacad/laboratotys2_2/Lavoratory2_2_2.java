package com.brainacad.laboratotys2_2;

//import  com.brainacad.laboratotys2_2.Matrix;

/**
 * Created by Таня on 10.09.2016.
 * Write class that create instances of class Matrix and execute his methods.
 */
public class Lavoratory2_2_2 {
    public static void main(String[] args) throws Exception {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix result = new Matrix();

        //System.out.println("Please ");

        matrix1.fillMatrix();
        matrix2.fillMatrix();

        matrix1.printMatrix(matrix1.getMatrix());
        matrix2.printMatrix(matrix2.getMatrix());

        result.setMatrix(result.addition(matrix1.getMatrix(), matrix2.getMatrix()));
        result.printMatrix(result.getMatrix());

        result.multiplication(matrix1.getMatrix(), matrix2.getMatrix());
        result.printMatrix(result.getMatrix());
    }
}
