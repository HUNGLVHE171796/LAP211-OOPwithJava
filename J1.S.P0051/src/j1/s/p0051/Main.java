/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step1: Display a menu
        displayMenu();
        //Step2: Enter an option
        int choice = GetInput.InputChoice();
        switch (choice) {
            //Step2: Display result normal calculator
            case 1:
                Calculator.normalCalculator();
                break;
            //Step3: Display result BMI Calculator
            case 2:
                Calculator.bmiCalculator();
                break;
            //Step4: Exit program
            case 3:
                System.exit(0);
                break;
        }
    }

    private static void displayMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }
}
