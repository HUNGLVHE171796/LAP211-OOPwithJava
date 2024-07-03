/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0066;

/**
 *
 * @author admin
 */
public class J1SP0066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            //Step1: Display Gui
            displayGui();
            //Step2: Enter an choice
            int choice = GetInput.getChoice();
            switch (choice) {
                    //Step2: Check car exist
                    case 1:
                    Car.checkCarExist();
                    //Step4: Display message
                    case 2: 
                    System.exit(0);
                //Step5: Exit program

            }
        }
    }

}
