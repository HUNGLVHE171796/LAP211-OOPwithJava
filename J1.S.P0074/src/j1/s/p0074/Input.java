/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Input {

    static int InputChoice() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter until input value valid
        while(true){
            try {
                System.out.println("Your choice:");
                String number = scanner.nextLine();
                //Check if input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Empty!");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < 1 || output > 4) { 
                        System.out.println("Please enter number appear in the screen!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter number appear in the screen!");
            }
        }
    }

    static int InputRow(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter until input value valid
        while(true){
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Row in matrix cannot be empty!");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < 0) {
                        System.out.println("Please enter positive integer number!");
                    } else if(output == 0) { 
                        System.out.println("Not zero!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter positive integer number!");
            }
        }
    }

    static int InputColumn(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter until input value valid
        while(true){
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Column in matrix cannot be empty!");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < 0) {
                        System.out.println("Please enter positive integer number!");
                    } else if(output == 0) { 
                        System.out.println("Not zero!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter positive integer number!");
            }
        }
    }

    static int InputValueMatrix(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter until input value valid
        while(true) {
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check input value if is empty
                if(number.isEmpty()) { 
                    System.out.println("Value of matrix cannot be empty!");
                } else { 
                    int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < min || output > max) { 
                        System.out.println("Value of matrix is invalid!");
                    } else { 
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Value of matrix is digit!");
            }
        }
    }
    
}
