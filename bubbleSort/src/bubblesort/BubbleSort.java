/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BubbleSort {

    /**
     * @paramargs the command line arguments
     */
    public static void main(String[] args) {
        //Step1: Input size of array
        int numberOfArray = InputSizeOfArray();
//        Step2: Generate random integer number for each array element
//        int[] array = RandomIntegerNumber(numberOfArray);
        int[]array = { -5, 1, 6, 15, 7};
        //Step3: Display unsorted array
        DisplayUnsortedArray(array);
        //Step4: Sort array by bubble sort
        SortArrayByBubbleSort(array);
        //Step5: Display sorted array
        DisplaySortedArray(array);

    }

    private static int InputSizeOfArray() {
        Scanner scanner = new Scanner(System.in);
        //Check input value
        //Loop re-enter if input value is invalid
        while (true) {
            try {
                //Display message to the users
                System.out.println("Enter number of array: ");
                String number = scanner.nextLine();
                //Check input value, if it empty --> error
                if (number.isEmpty()) {
                    System.out.println("Array cannot be empty!");
                } else {
                    double output = Double.parseDouble(number);
                    //Check input value
                    if (output <= 0) {
                        System.out.println("Please enter a positive decimal number!");
                    } else {
                        return (int)output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a positive decimal number!");
            }  
        }
    }

    private static int[] RandomIntegerNumber(int numberOfArray) {
        int[] array = new int[numberOfArray];
        Random random = new Random();
        //Iterate through array
        for (int i = 0; i < array.length; i++) {
            //Assign random value to element at position i
            array[i] = random.nextInt(numberOfArray);
        }
        return array;
    }

    private static void DisplayUnsortedArray(int[] array) {
        System.out.print("Unsorted array: [");
        //Iterate through array
        //Display the current element followed by comma
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        //Display the last element with closing bracket
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printFormatTest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\t");
    }

    private static void SortArrayByBubbleSort(int[] array) {
        //Loop through each elements of the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            //Loop through from first unsorted element to the last unsorted element in array
            for (int j = 0; j < array.length - i - 1; j++) {
                printFormatTest(array);
                //Check if the current element is greater than the next element --> swap
                if (array[j] > array[j + 1]) {
                    System.out.println(array[j] + ">" + array[j + 1] + ", swap");
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //Check if the current element equal to the next element --> ok
                } else if (array[j] == array[j + 1]) {
                    System.out.println(array[j] + "=" + array[j + 1] + ", ok");
                    //Check if the current element is less than to the next element --> ok                   
                } else if (array[j] < array[j + 1]) {
                    System.out.println(array[j] + "<" + array[j + 1] + ", ok");
                }
            }
        }
    }

    private static void DisplaySortedArray(int[] array) {
        System.out.print("Sorted array: [");
        //Iterat through array
        for (int i = 0; i < array.length - 1; i++) {
            //Display the current element followed by comma
            System.out.print(array[i] + ", ");
        }
        //Display the last element with closing bracket
        System.out.print(array[array.length - 1] + "]");
    }
}
