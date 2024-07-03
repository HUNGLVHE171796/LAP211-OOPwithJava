/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        ManageStudent managestudent = new ManageStudent();
        //Step1: Display Gui
        displayGui();
        //Step2: Enter student data 
        managestudent.enterInforStudent(listStudent);
        //Step3: Display notify result of students
        managestudent.displayInformationStudent(listStudent);
        //Step4: Display classification information
        managestudent.displayClassificationInformation(listStudent);
    }

    private static void displayGui() {
        System.out.println("====== Management Student Program ======");
    }
}
