/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0056;

import java.rmi.Naming;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author admin
 */
class Management {

    static void addWorker(ArrayList<Worker> listWorker, ArrayList<History> history) {
        String id;
        //Loop until input id worker valid
        while(true) {
            id = GetInput.inputString("Enter Code:");
            //Check duplicate code
            if(isDuplicateId(id, listWorker)) {
                System.out.println("Duplicate code");
            } else {
                break;
            }
        }
        String name = GetInput.inputString("Enter name:");
        int age = GetInput.inputAge();
        double salary = GetInput.inputSalary();
        String workLocation = GetInput.inputString("Enter work location:");
        listWorker.add(new Worker(id, name, age, salary, workLocation));
        history.add(new History("UP", name, id, name, age, salary, workLocation));     
    }

    private static boolean isDuplicateId(String id, ArrayList<Worker> listWorker) {
        //Loop through each element in list
        for (Worker worker : listWorker) {
            //Check duplicate id
            if(worker.getId().equalsIgnoreCase(id)) {
                return true;
            }             
        }
        return false;
    }

    static void changeSalaryUp(ArrayList<Worker> listWorker, ArrayList<History> history) {
        String id = GetInput.inputString("Enter code:");
        
    }

    static void changeSalaryDown(ArrayList<Worker> listWorker, ArrayList<History> history) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void displayInforSalary(ArrayList<Worker> listWorker, ArrayList<History> history) {
        //Check list history is empty
        if(history.isEmpty()) { 
            System.out.println("No history");
            return;
        }
        System.out.printf("%-5s %-15s %-5s %-10s %-10s %-20s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        //Loop through each element in list
        for (History history1 : history) {
            System.out.printf("%-5s %-15s %-5d %-10d %-10s %-20s\n", history1.getId(),
                    history1.getName(), history1.getAge(), history1.getSalary(), history1.getStatus(), history1.getDate());
        }
    }   

    
}

