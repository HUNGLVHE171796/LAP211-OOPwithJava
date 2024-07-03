/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static String getStudentName(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            System.out.print(mess);
            String input = scanner.nextLine().trim();
            //Check input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
            } else if (input.matches("[a-zA-Z0-9 ]+")) {
                return input;
            } else {
                System.out.println("Input valid!");
            }
        }
    }

    static String getClassName(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            System.out.print(mess);
            String input = scanner.nextLine().trim();
            //Check input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                //Check input value
            } else if (input.matches("[a-zA-Z0-9 ]+")) {
                return input;
            } else {
                System.out.println("Input valid!");
            }
        }
    }

    static double getMarkMaths(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.print(mess);
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    double mark = Double.parseDouble(input);
                    //Check input value
                    if(mark > 10) {
                        System.out.println("Maths is less than equal ten");
                    } else if(mark < 0) {
                        System.out.println("Maths is greater than equal zero");
                    } else {
                        return mark;
                    }
                }
            } catch (Exception e) {
                System.out.println("Maths is digit");
            }
        }
    }

    static double getMarkChemistry(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.print(mess);
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    double mark = Double.parseDouble(input);
                    //Check input value
                    if(mark > 10) {
                        System.out.println("Chemistry is less than equal ten");
                    } else if(mark < 0) {
                        System.out.println("Chemistry is greater than equal zero");
                    } else {
                        return mark;
                    }
                }
            } catch (Exception e) {
                System.out.println("Chemistry is digit");
            }
        }
    }

    static double getMarkPhysical(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            try {
                System.out.print(mess);
                String input = scanner.nextLine();
                //Check input is empty
                if(input.isEmpty()) { 
                    System.out.println("Empty");
                } else {
                    double mark = Double.parseDouble(input);
                    //Check input value
                    if(mark > 10) {
                        System.out.println("Physics is less than equal ten");
                    } else if(mark < 0) {
                        System.out.println("Physics is greater than equal zero");
                    } else {
                        return mark;
                    }
                }
            } catch (Exception e) {
                System.out.println("Physics is digit");
            }
        }
    }
    
    static String CheckYesNo() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input string is invalid
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N):");
            String answer = scanner.nextLine().trim();
            //Check input is empty
            if (answer.isEmpty()) {
                System.out.println("Input cannot be empty!");
            } else if (answer.matches("[YyNn]")) {
                return answer;
            } else {
                System.out.println("Please enter Y(y)/N(n)!");
            }
        }
    }
}
