/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0060;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            //Step1: DisplayGui
            displayGui();
            //Step2: Allow user input bill
            int[] bills = inputBills();
            //Step3: Allow user input amount of wallet
            int wallet = inputWallet();
            //Step4: Display total and message
            displayTotalandMess(bills, wallet);
        }
    }

    private static void displayGui() {
        System.out.println("====== Shopping program ==========");
    }

    private static int[] inputBills() {
        System.out.print("input number of bill:");
        int size = inputInt();
        int []bills = new int[size];
        //Loop through each index in array
        for (int i = 0; i < bills.length; i++) {
            System.out.print("input value of bill " + (i+1) +":");
            bills[i] = inputInt();
        }
        return bills;
    }

    private static int inputWallet() {
        System.out.print("input value of wallet:");
        int wallet = inputInt();
        return wallet;
    }

    private static void displayTotalandMess(int[] bills, int wallet) {
        int total = totalOfBill(bills);
        System.out.println("this is total of bill:" + total);
        //Check total greater than wallet or not
        if(payMoney(wallet, total)) { 
            System.out.println("You can buy it.");
        } else { 
            System.out.println("You can't buy it.");
        }
    }

    private static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try { 
                String number = scanner.nextLine();
                //Check number input is empty
                if(number.isEmpty()) { 
                    System.out.println("Empty");
                } else { 
                    int output = Integer.parseInt(number);
                    int max = Integer.MAX_VALUE;
                    //Check input value
                    if(output <= 0 || output > max) { 
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

    private static int totalOfBill(int[] bills) {
        int total = 0;
        //Loop through each index in array
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
        }
        return total;
    }

    private static boolean payMoney(int wallet, int total) {
        //Check if total greater than wallet
        if(total > wallet) { 
            return false;
        }
        return true;
    }
}
