/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

/**
 *
 * @author admin
 */
class Matrix {

    static int[][] GetMatrix1(int row1, int column1) {
        int matrix[][] = new int[row1][column1];
        //Loop until the last index in row1
        for (int i = 0; i < row1; i++) {
            //Loop until the last index in column1 
            for (int j = 0; j < column1; j++) {
                matrix[i][j] = Input.InputValueMatrix("Enter Matrix1[" + (i+1) + "][" + (j+1) + "]:");
            }
        }
        return matrix;
    }

    static int[][] GetMatrix2(int row2, int column2) {
        int matrix[][] = new int[row2][column2];
        //Loop until the last index in row2
        for (int i = 0; i < row2; i++) {
            //Loop until the last index in column2
            for (int j = 0; j < column2; j++) {
                matrix[i][j] = Input.InputValueMatrix("Enter Matrix2[" + (i+1) + "][" + (j+1) + "]:");
            }
        }
        return matrix;
    }
    
    
}
