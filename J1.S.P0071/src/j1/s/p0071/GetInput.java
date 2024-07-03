/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.Date;
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
                    if(num > 4) {
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

    static String getString(String mess, String error, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int getInteger(String mess, String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Date getDate(String mess, String error, String regex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static double getDouble(String mess, String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
