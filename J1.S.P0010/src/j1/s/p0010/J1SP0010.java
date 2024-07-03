/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J1SP0010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step1: Input size of array
        int sizeOfArray = InputSizeOfArray();
        //Step2: Enter search value
        int searchNumber = InputNumber(sizeOfArray);
        //Step3: Generate random integer number for each array element
        int[] array = RandomIntegerNumber(sizeOfArray);
//        int[] array = {2, 2, 5, 2, 6, 9, 9, 8, 9, 8};
        //Step4: Display the array
        DisplayArray(array);
        //Step5: Display the index of search number in array
        DisplayIndexOfSearchNumber(array, searchNumber);
    }

    private static int InputSizeOfArray() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try { 
                System.out.println("Enter number of array: ");
                String number = scanner.nextLine();
                //Check number input is empty
                if(number.isEmpty()) { 
                    System.out.println("Array cannot be empty!");
                } else { 
                    double output = Double.parseDouble(number);
                    //Check input value
                    if(output <= 0) { 
                        System.out.println("Please enter a positive decimal number!");
                    } else if((int) output == output) { 
                        return (int)output;
                    } else { 
                        System.out.println("Not a real integer number!");
                    }
                }
            } catch (Exception e) { 
                System.out.println("Please enter a positive decimal number!");
            }
        }   
    }
    
    private static int InputNumber(int sizeOfArray) {
        Scanner scanner = new Scanner(System.in);
        while(true) { 
            try {
                System.out.println("Enter search value: ");
                String number = scanner.nextLine();
                //Check input number is empty
                if(number.isEmpty()) { 
                    System.out.println("Empty, Please enter number!");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check range of input value
                    if(output < 0 || output > sizeOfArray) { 
                        System.out.println("Please input number between 0 - " + sizeOfArray);
                    } else { 
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter positve integer number!");
            }
        }
        
    }

    private static int[] RandomIntegerNumber(int sizeOfArray) {
        Random random = new Random();
        int[] array = new int[sizeOfArray];
        //Iterate through the elements in the array
        for (int i = 0; i < array.length; i++) {
            //Assign random value to the element at position i
            array[i] = random.nextInt(sizeOfArray);
        }
        return array;
    }

    private static void DisplayArray(int[] array) {
        System.out.print("The array: [");
        //Iterate through the element in the array, except the last element
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static void DisplayIndexOfSearchNumber(int[] array, int searchNumber) {
        int count = 0;
        //Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            //Check if element at position i equal to searchNumber -- > ok
            if(array[i] == searchNumber) { 
                count++;
                System.out.println("Found " + searchNumber + " at index: " + i);
            }
        }
        //Check if the counter variable is increased after the loop ends
        if(count == 0) { 
            System.out.println("Not found!");
        }
    }
}
