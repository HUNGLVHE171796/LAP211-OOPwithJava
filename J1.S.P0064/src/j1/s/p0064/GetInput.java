/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0064;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try { 
                System.out.println("Select an option: ");
                String number = scanner.nextLine();
                //Check number input is empty
                if(number.isEmpty()) { 
                    System.out.println("Empty");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < 1 || output > 4) { 
                        System.out.println("Input invalid");
                    } else { 
                        return output;
                    }
                }
            } catch (Exception e) { 
                System.out.println("Input invalid");
            }
        }   
    }

    static String getPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Phone number: ");
            String result = scanner.nextLine().trim();
            //Check input string is empty
            if(result.isEmpty()) { 
                System.out.println("Empty");
            } else { 
                return result;
            }
        }
    }

    static String getEmail() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Email: ");
            String result = scanner.nextLine().trim();
            //Check input string is empty
            if(result.isEmpty()) { 
                System.out.println("Empty");
            } else { 
                return result;
            }
        }
    }

    static String getDate() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Date: ");
            String result = scanner.nextLine().trim();
            //Check input string is empty
            if(result.isEmpty()) { 
                System.out.println("Empty");
            } else { 
                return result;
            }
        }
    }
    
}
