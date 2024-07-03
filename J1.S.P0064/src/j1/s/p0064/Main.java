/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0064;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            //Step1: DisplayGUI
            displayGui();
            //Step2: Enter an choice
            int choice = GetInput.getChoice();
            switch (choice) {
                //Step3: Check the format of the input phone number
                case 1:
                    CheckFormat.checkPhoneNumber();
                    break;
                //Step4: Check the format of email
                case 2:
                    CheckFormat.checkEmail();
                    break;
                //Step5: Check the foramt of date
                case 3:
                    CheckFormat.checkDate();
                    break;
                    //Step6: Exit program
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void displayGui() {
        System.out.println("====== Validate Program ======");
        System.out.println("1. Check phone number");
        System.out.println("2. Check email");
        System.out.println("3. Check date");
    }
}
