/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Van Man
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Find Fibonacci numbers      
        int[] FindFibonacci = FindFibonacci(45);
        // Display 
        Display(FindFibonacci);
    }

    public static int[] FindFibonacci(int size) {
        int[] arr = new int[size];
        fibonacci(arr, 45, 0);
        return arr;
    }

    public static void Display(int[] FindFibonacci) {
        System.out.println("Đề bài .......:");
        //loop throught each element to print array
        for (int i = 0; i < FindFibonacci.length; i++) {
            System.out.println((i+1) + ": " + FindFibonacci[i]);
            //System.out.print(FindFibonacci[i]);
            if (i < FindFibonacci.length - 1) {
                System.out.print(" ,");
            }
        }
    }

    public static void fibonacci(int[] arr, int size, int index) {
        //case index < size 
        while (index < size) {
            //case n = 0
            if (index == 0) {
                arr[index] = 0;
                //case index = 1
            }
            if (index == 1) {
                arr[index] = 1;
                //case index > 1
            }
            if (index > 1) {
                arr[index] = arr[index - 1] + arr[index - 2];
            }
            fibonacci(arr, size, index + 1);
        }
    }

}
