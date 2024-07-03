/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.println("Select an option:");
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    int num = Integer.parseInt(input);
                    //Check input value
                    if(num > 5) {
                        System.out.println("Invalid number");
                    } else if(num < 1) {
                        System.out.println("Invalid number");
                    } else {
                        return num;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error input choice");
            }
        }
    }

    static String inputString(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop until input string is valid
        while(true) {
            System.out.print(mess);
            String input = scanner.nextLine().trim();
            //Check input string is empty
            if(input.isEmpty()) { 
                System.out.println("String cannot be empty");
            } else if(input.matches("[a-zA-Z0-9 ]+")) {
                return input;
            } else {
                System.out.println("String invalid");
            }
        }
    }

    static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.print("Enter Age:");
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    int num = Integer.parseInt(input);
                    //Check input value
                    if(num < 0) {
                        System.out.println("Invalid age");
                    } else {
                        return num;
                    }                      
                }
            } catch (Exception e) {
                System.out.println("Invalid age");
            }
        }
    }

    static double inputSalary() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.print("Enter Salary:");
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    double num = Double.parseDouble(input);
                    double max = Double.MAX_VALUE;
                    //Check input value
                    if(num < 0 || num > max) {
                        System.out.println("Invalid salary");
                    } else {
                        return num;
                    }                      
                }
            } catch (Exception e) {
                System.out.println("Invalid salary");
            }
        }
    }
    
}
