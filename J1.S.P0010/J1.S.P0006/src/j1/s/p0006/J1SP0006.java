/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0006;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J1SP0006 {

    /**
     * @param args the command line arguments
     */
    public static boolean test = true;

    public static void main(String[] args) {
        //Step1: Enter size of array
        int sizeOfArray = inputSize();
        //Step2: Enter search number
        int searchNumber = inputSearchNumber();
        //Step3: Generate random integer in number range for each array element
//        int array[] = generateArray(sizeOfArray);
        int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        //Step4: Sort array and display array sorted
        Arrays.sort(array);
        displayArray(array);
        //Step5: Display the index of search number in array
        displayIndex(array, searchNumber, test);
    }

    private static int inputSize() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter number of array: ");
                String number = scanner.nextLine();
                //Check number input is empty
                if (number.isEmpty()) {
                    System.out.println("Array cannot be empty!");
                } else {
                    int output = Integer.parseInt(number);
                    //Check input value
                    if (output <= 0) {
                        System.out.println("Please enter a positive decimal number!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a positive decimal number!");
            }
        }
    }

    private static int inputSearchNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter search value: ");
                String number = scanner.nextLine();
                //Check number input is empty
                if (number.isEmpty()) {
                    System.out.println("cannot be empty!");
                } else {
                    int output = Integer.parseInt(number);
                    //Check input value
                    if (output <= 0) {
                        System.out.println("Please enter a positive decimal number!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a positive decimal number!");
            }
        }
    }

    private static int[] generateArray(int sizeOfArray) {
        Random random = new Random();
        int[] array = new int[sizeOfArray];
        //Loop through each element in array
        for (int i = 0; i < array.length; i++) {
            //Assign random value to the element at position i
            array[i] = random.nextInt(sizeOfArray);
        }
        return array;
    }

    private static void displayArray(int[] array) {
        System.out.print("Sorted array: ");
        System.out.print("[");
        //Loop through each element in array, except the last element
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");

    }

    private static void displayIndex(int[] array, int searchNumber, boolean test) {
        int left = 0, right = array.length - 1;
        for (int step = 1; left <= right; step++) {
            int middle = (right + left) / 2;
            //Check if the middle element equal to search number
            if(array[middle] == searchNumber) { 
                //test algorithm, display searching step
                if (test) displayStep(array, searchNumber, step, middle, "==");
                System.out.println("Found " + searchNumber + " at index: " + middle);
                break;
            } //Check if searched value is less than the middle element
            else if(array[middle] > searchNumber) { 
                right = middle - 1;
                //test algorithm, display searching step
                if (test) displayStep(array, searchNumber, step, middle, ">");
            } else {
                left = middle + 1;
                //test algorithm, display searching step
                if (test) displayStep(array, searchNumber, step, middle, "<");
            }
            //if subarray has no element
            if(left > right) {
                if(!test) { 
                    System.out.println("Not found");
                } else {
                    System.out.print("Step " +(++step) + " (searched value is absent): ");
                    //Loop through each element in array
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }

    private static void displayStep(int[] array, int searchNumber, int step, int middle, String string) {
        System.out.print("Step " + step +" (middle element is " + array[middle] + string + searchNumber + "): ");
        //Loop through each element in array
        for (int i = 0; i < array.length; i++) {
            //add '[' before element is chosen middle
            if(i == middle) { 
                System.out.print("[" + array[middle] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
}
