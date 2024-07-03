/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class J1SP0055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Doctor> ld = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            displayMenu();
            int choice = GetInput.getChoice();
            switch (choice) {
                case 1:
                    Manager.addDoctor(ld);
                    break;
                case 2:
                    Manager.updateDoctor(ld);
                    break;
                case 3:
                    Manager.deleteDoctor(ld);
                    break;
                case 4:
                    Manager.searchDoctor(ld);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("========= Doctor Management =========");
        System.out.println("   1. Add doctor");
        System.out.println("   2. Update doctor");
        System.out.println("   3. Delete doctor");
        System.out.println("   4. Search doctor");
        System.out.println("   5. Exit");
    }

}
