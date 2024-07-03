/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ManageStudent {

    void enterInforStudent(ArrayList<Student> listStudent) {
        while (true) {
            String name = GetInput.getStudentName("Name:");
            String classes = GetInput.getClassName("Classes:");
            double maths = GetInput.getMarkMaths("Maths:");
            double chemistry = GetInput.getMarkChemistry("Chemistry:");
            double physical = GetInput.getMarkPhysical("Physics:");
            double average = (maths + chemistry + physical) / 3;
            String type = null;
            //Classification students
            if (average > 7.5) {
                type = "A";
            } else if (average >= 6 && average <= 7.5) {
                type = "B";
            } else if (average >= 4 && average < 6) {
                type = "C";
            } else if (average < 4) {
                type = "D";
            }
            Student student = new Student(name, classes, maths, chemistry, physical, average, type);
            listStudent.add(student);
            //Check if user to want continue enter student
            if (!checkYesNoz()) {
                return;
            }
        }
    }

    private boolean checkYesNoz() {
        String result = GetInput.CheckYesNo();
        //Check input of user
        if (result.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    void displayInformationStudent(ArrayList<Student> listStudent) {
        int i = 0;
        //Loop through all student in list
        for (Student student : listStudent) {
            System.out.println("------ Student" + (++i) + " Info ------");
            System.out.println("Name:" + student.getStudentName());
            System.out.println("Classes:" + student.getClassName());
            System.out.println("AVG:" + student.getAverage());
            System.out.println("Type:" + student.getType());
        }
    } 
    
    private HashMap<String, Double> getPercentTypeStudent(ArrayList<Student> listStudent) {
        HashMap<String, Double> getPercentTypeStudent = new HashMap<>();
        int totalStudent = listStudent.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        //Loop through all element in list
        for (int i = 0; i < totalStudent; i++) {
            //Check type of each student
            if(listStudent.get(i).getType().equals("A")) {
                typeA++;
            }
            if(listStudent.get(i).getType().equals("B")) {
                typeB++;
            }
            if(listStudent.get(i).getType().equals("C")) {
                typeC++;
            }
            if(listStudent.get(i).getType().equals("D")) {
                typeD++;
            }
        }
        getPercentTypeStudent.put("A", (typeA / totalStudent) * 100);
        getPercentTypeStudent.put("B", (typeB / totalStudent) * 100);
        getPercentTypeStudent.put("C", (typeC / totalStudent) * 100);
        getPercentTypeStudent.put("D", (typeD / totalStudent) * 100);
        return getPercentTypeStudent;
    }
    
    void displayClassificationInformation(ArrayList<Student> listStudent) {
        HashMap<String, Double> getPercentTypeStudent = getPercentTypeStudent(listStudent);
        //Loop through all entry student in map
        for (Map.Entry student : getPercentTypeStudent.entrySet()) {
            System.out.printf("%s: %.1f%%\n", student.getKey(), student.getValue());           
        }
    } 
}
