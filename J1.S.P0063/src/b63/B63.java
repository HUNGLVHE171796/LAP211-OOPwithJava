/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b63;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class B63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] person = new Person[3];
        //Step1: Input information person
        addInfoPerson(person);
        //Step2: Sort information person
        sortInforPerson(person);
        //Step3: Display information person
        displayInforPerson(person);
    }

    private static String getString(String mess) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(mess);
            String input = scanner.nextLine().trim();
            //Check input is empty
            if (input.isEmpty()) {
                System.out.println("Empty");
            } else {
                return input;
            }
        }
    }

    private static double getDouble(String mess) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check number input is empty
                if (number.isEmpty()) {
                    throw new Error();
                    
                } else {
                    double output = Double.parseDouble(number);

                    //Check input value
                    if (output <= 0) {
                        throw new Exception();
                    } else {
                        return output;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You must input digit");
            } catch (Exception e) { 
                System.out.println("Salary is greater than zero");
            } catch (Error e) { 
                System.out.println("You must input Salary");
            }
        }
    }

    private static void addInfoPerson(Person[] person) {
        System.out.println("=====Manegement Person programer=====");
        int count = 0;
        while (count < 3) {
            System.out.println("Input Information of Person");
            String name = getString("Please input name:");
            String address = getString("Please input address:");
            double salary = getDouble("Please input salary:");
            person[count] = new Person(name, address, salary);
            count++;
        }

    }

    private static void sortInforPerson(Person[] person) {
        for(int i = 0; i < person.length; i++){
           for(int j = 0; j < person.length - 1 - i; j++){
               if(person[j].getSalary() > person[j + 1].getSalary()){
                   Person tmp = person[j];
                   person[j] = person[j + 1];
                   person[j + 1] = tmp;
               }
           }
       }
    }

    private static void displayInforPerson(Person[] person) {
         System.out.println("");
        for (int i = 0; i < person.length; i++) {
            System.out.println("Information of Person you have entered:");
            System.out.println("Name:" + person[i].getName());
            System.out.println("Address:" + person[i].getAddress());
            System.out.println("Salary:" + person[i].getSalary());
            System.out.println("");
        }
    }

}
