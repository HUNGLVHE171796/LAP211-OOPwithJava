/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

/**
 *
 * @author admin
 */
public class J1SP0074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step1: Display a menu
        Display.displayMenu();
        //Step2: User enter an option
        int choice = Input.InputChoice();
        switch (choice) {
            //Step3: Display result function addition matrixes
            case 1:
                Display.AdditionMatrix();
                break;
            //Step4: Display result function subtraction matrixes
            case 2:
                Display.SubtractionMatrix();
                break;
            //Step5: Display result function multiplication matrixes
            case 3:
                Display.MuliplicationMatrixes();
                break;
            //Step6: Exit program
            case 4:
                System.exit(0);
                break;

        }
    }
}
