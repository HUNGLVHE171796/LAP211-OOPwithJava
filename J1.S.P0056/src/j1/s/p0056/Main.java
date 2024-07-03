/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> listWorker = new ArrayList<>();
        ArrayList<History> history = new ArrayList<>();
        while (true) {
            //Step1: Display a menu
            displayMenu();
            //Step2: User select an option
            int choice = GetInput.inputChoice();
            switch (choice) {
                //Step3: Add an worker
                case 1:
                    Management.addWorker(listWorker, history);
                    break;
                //Step4: Increase salary
                case 2:
                    Management.changeSalaryUp(listWorker, history);
                    break;
                //Step5: Decrease salary
                case 3: 
                    Management.changeSalaryDown(listWorker, history);
                    break;
                //Step6: Show all worker have been adjusted salary by worker code
                case 4:
                    Management.displayInforSalary(listWorker, history);
                    break;
                //Step7: Exit program
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("======= Worker Management =======");
        System.out.println("   1. Add Worker\n"
                        + "   2. Up Salary\n"
                        + "   3. Down Salary\n"
                        + "   4. Display Information salary\n"
                        + "   5. Exit");
    }
}
