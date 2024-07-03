/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class J1SP0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManageTask manage = new ManageTask();
        ArrayList<Task> tasksList = new ArrayList<>();
        //Loop until user selects the exit program option
        while (true) {
            //Step1: Display the menu
            displayMenu();
            //Step2: Enter an option
            int choice = GetInput.inputChoice();
            //Step3: Perform function based on selected option
            perfromFunction(manage, choice, tasksList);
        }
    }

    private static void perfromFunction(ManageTask manage, int choice, ArrayList<Task> tasksList) {
        switch(choice) {
            //user enter the information requested Task
            case 1:
                manage.createInforRequestedOfTask(tasksList);
                break;
            //delete the information of task by id
            case 2: 
                manage.deleteTaskById(tasksList);
                break;
            //display information of task
            case 3: 
                manage.display(tasksList);
                break;
            //Exit program
            case 4:
                System.exit(0);
                break;
        }
    }

    private static void displayMenu() {
        System.out.println("======== Task program ========\n"
                + "1. Add Task\n"
                + "2. Delete Task\n" 
                + "3. Display Task\n" 
                + "4. exit");
    }
}
