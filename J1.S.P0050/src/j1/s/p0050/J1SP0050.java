/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

/**
 *
 * @author admin
 */
public class J1SP0050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The loop display the menu
        while (true) {
            //Step1: Display a menu
            DisplayMenu();
            //Step2: User enter an option
            int choice = Input.InputChoice();
            switch (choice) {
                //Step3: Display result superlative equation
                case 1:
                    Calculator.SuperlativeEquation();
                    break;
                //Step4: Display result quadratic equation
                case 2:
                    Calculator.QuadraticEquation();
                    break;
                //Step5: Exit program
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void DisplayMenu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }
}
