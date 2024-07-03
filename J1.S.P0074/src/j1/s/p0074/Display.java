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
class Display {

    static void displayMenu() {
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

    static void AdditionMatrix() {
        System.out.println("-------- Addition --------");
        int row1 = Input.InputRow("Enter Row Matrix 1:");
        int column1 = Input.InputColumn("Enter Column Matrix 1:");
        int matrix1[][] = Matrix.GetMatrix1(row1, column1);
        
        int row2, column2;       
        //Loop to check if two matrices are eligible to perform the math operation
        while(true){
            row2 = Input.InputRow("Enter Row Matrix 2:");
            //If the number of rows in matrix1 equal to matrix2
            if(row1 == row2) { 
                break;
            } else { 
                System.out.println("The number of rows in matrix1 must be equal to matrix2");
            }
        }
        //Loop to check if two matrices are eligible to perform the math operation
        while(true) {
            column2 = Input.InputColumn("Enter Column Matrix 2:");
            //Check if the columns in matrix1 equal to matrix2
            if(column1 == column2) { 
                break;
            } else { 
                System.out.println("The number of columns in matrix1 must be equal to matrix2");
            }
        }
        int matrix2[][] = Matrix.GetMatrix2(row2, column2);
        int result[][] = new int[row2][column2];
        
        //Loop until the last index in row2
        for (int i = 0; i < row2; i++) {
            //Loop until the last index in column2
            for (int j = 0; j < column2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("-------- Result --------");
        DisplayMatrix(matrix1, row1, column1);
        System.out.println("+");
        DisplayMatrix(matrix2, row2, column2);
        System.out.println("=");
        DisplayMatrix(result, row2, column2);
    }

    static void SubtractionMatrix() {
        System.out.println("----- Subtraction ------");
        int row1 = Input.InputRow("Enter Row Matrix 1:");
        int column1 = Input.InputColumn("Enter Column Matrix 1:");
        int matrix1[][] = Matrix.GetMatrix1(row1, column1);
        
        int row2, column2;       
        //Loop to check if two matrices are eligible to perform the math operation
        while(true){
            row2 = Input.InputRow("Enter Row Matrix 2:");
            //If the number of rows in matrix1 equal to matrix2
            if(row1 == row2) { 
                break;
            } else { 
                System.out.println("The number of rows in matrix1 must be equal to matrix2");
            }
        }
        //Loop to check if two matrices are eligible to perform the math operation
        while(true) {
            column2 = Input.InputColumn("Enter Column Matrix 2:");
            //Check if the columns in matrix1 equal to matrix2
            if(column1 == column2) { 
                break;
            } else { 
                System.out.println("The number of columns in matrix1 must be equal to matrix2");
            }
        }
        int matrix2[][] = Matrix.GetMatrix2(row2, column2);
        int result[][] = new int[row2][column2];
        
        //Loop until the last index in row2
        for (int i = 0; i < row2; i++) {
            //Loop until the last index in column2
            for (int j = 0; j < column2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("-------- Result --------");
        DisplayMatrix(matrix1, row1, column1);
        System.out.println("-");
        DisplayMatrix(matrix2, row2, column2);
        System.out.println("=");
        DisplayMatrix(result, row2, column2);
    }

    static void MuliplicationMatrixes() {
        System.out.println("-------- Multiplication -------");
        int row1 = Input.InputRow("Enter Row Matrix 1:");
        int column1 = Input.InputColumn("Enter Column Matrix 1:");
        int matrix1[][] = Matrix.GetMatrix1(row1, column1);
        int row2;
        //Loop to check if two matrices are eligible to perform the math operation
        while(true) {
            row2 = Input.InputRow("Enter Row Matrix 2:");
            //Check if the columns in matrix1 equal to matrix2
            if(row2 == column1) { 
                break;
            } else { 
                System.out.println("The number of rows in matrix2 must be equal to the number of columns in matrix1");
            }
        }
        int column2 = Input.InputColumn("Enter Column Matrix 2:");
        int matrix2[][] = Matrix.GetMatrix2(row2, column2);
        int result[][] = new int[row1][column2];
        
        //Loop until the last index in row1
        for (int i = 0; i < row1; i++) {
            //Loop until the last index in column2
            for (int j = 0; j < column2; j++) {
                //Loop until the last index in row2
                for (int k = 0; k < row2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }
        
        System.out.println("-------- Result --------");
        DisplayMatrix(matrix1, row1, column1);
        System.out.println("*");
        DisplayMatrix(matrix2, row2, column2);
        System.out.println("=");
        DisplayMatrix(result, row1, column2);
    }

    private static void DisplayMatrix(int[][] matrix, int row, int column) {
        //Loop until the last index in row
        for (int i = 0; i < row; i++) {
            //Loop until the last index in column
            for (int j = 0; j < column; j++) {
                System.out.print("[" + matrix[i][j] +"]");
            }
            System.out.println("");
        }
    }
    
}
