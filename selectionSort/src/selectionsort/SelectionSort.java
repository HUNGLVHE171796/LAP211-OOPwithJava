/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step1: Input number of array
        int numberOfArray = InputNumberOfArray();
        //Step2: Generate random integer number for each array element
        int array[] = RandomIntegerNumber(numberOfArray);
//        int array[] = {5, 1, 12, -5, 16, 2, 12, 14};
        //Step3: Display unsorted array
        displayUnsortedArray(array);
        //Step4: Sort array by selection sort
        sortArray(array);
        //Step5: Display sorted array
        displaySortedArray(array);
    }

    private static int InputNumberOfArray() {
        Scanner scanner = new Scanner(System.in);
        int output;
        int min = 1, max = Integer.MAX_VALUE;
        //Check input number
        //Loop to re-enter if input number is invalid
        while (true) {
            try {
                //Display message to the user
                System.out.println("Enter number of array: ");
                //Allow to user enter a number
                String number = scanner.nextLine();
                //Input is empty --> tell error
                if(number.isEmpty()) { 
                    System.out.println("Number of array cannot be empty!");
                } else {
                    output = Integer.parseInt(number);
                    if(output < min || output > max) { 
                        System.out.println("Please enter a positive integer number!");
                    } else {
                        return output;
                    } 
                }
            } catch (Exception e) {
                System.out.println("Please enter a positive integer number!");
            }
        }
    }

    private static int[] RandomIntegerNumber(int numberOfArray) {
        int array[] = new int[numberOfArray];
        Random random = new Random();
        //Interate through array
        for (int i = 0; i < array.length; i++) {
            //Assign random value integer to the element at position i
            array[i] = random.nextInt(numberOfArray);
        }
        return array;
    }

    private static void displayUnsortedArray(int[] array) {
        System.out.print("Unsorted array: [");
        //Iterate through array
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
    
    public static void printFormatTest (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    private static void sortArray(int[] array) {
        //Iterate through array unsorted
        printFormatTest(array);
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            //Iterate to find the minimum element in unsorted array
            for (int j = i + 1; j < array.length; j++) {
                //Check if the current element is less than value in positive min(i) --> Assign min = j
                if(array[j] < array[min]) { 
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            printFormatTest(array);
        }
    }

    private static void displaySortedArray(int[] array) {
        System.out.print("Sorted array: [");
        //Iterate through array
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }  

}
