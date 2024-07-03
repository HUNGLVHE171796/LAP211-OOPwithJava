/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
class Calculator {

    static void SuperlativeEquation() {
        System.out.println("----- Calculate Equation -----");
        List<Double> list = new ArrayList<>();
        List<Double> listOdd = new ArrayList<>();
        List<Double> listEven = new ArrayList<>();
        List<Double> listPerfect = new ArrayList<>();

        double a = Input.InputCoefficients("Enter A: ");
        double b = Input.InputCoefficients("Enter B: ");
        list.add(a);
        list.add(b);
        double x;
        //Check the coefficient at a
        if (a == 0) {
            //Check the coefficient at b
            if (b == 0) {
                System.out.println("Solution: Empty!");
            } else {
                System.out.println("Solution: Null!");
            }
        } else {
            x = (-b) / a;
            System.out.println("Solution: x = " + x);
            list.add(x);
        }

        System.out.print("Number is Odd:");
        //Loop through each element in list 
        for (int i = 0; i < list.size(); i++) {
            //Check if odd number appear in list
            if (CheckOddNumber(list.get(i))) {
                listOdd.add(list.get(i));
            }
        }
        //Check list the odd number is empty
        if (listOdd.isEmpty()) {
            System.out.println("Don't have odd number");
        } else {
            Display(listOdd);
        }

        System.out.print("Number is Even:");
        //Loop through each element in list
        for (int i = 0; i < list.size(); i++) {
            //Check if even number appear in list
            if (CheckEvenNumber(list.get(i))) {
                listEven.add(list.get(i));
            }
        }
        //Check list the even number is empty
        if (listEven.isEmpty()) {
            System.out.println("Don't have even number");
        } else {
            Display(listEven);
        }

        System.out.print("Number is Perfect Square:");
        //Loop through each element in list
        for (int i = 0; i < list.size(); i++) {
            //Check if perfect number appear in list
            if (CheckPerfect(list.get(i))) {
                listPerfect.add(list.get(i));
            }
        }
        //Check list the perfect number is empty
        if (listPerfect.isEmpty()) {
            System.out.println("Don't have perfect square number");
        } else {
            Display(listPerfect);
        }
    }

    static void QuadraticEquation() {
        System.out.println("----- Calculate Quadratic Equation -----");
        List<Double> list = new ArrayList<>();
        List<Double> listOdd = new ArrayList<>();
        List<Double> listEven = new ArrayList<>();
        List<Double> listPerfect = new ArrayList<>();

        double a = Input.InputCoefficients("Enter A: ");
        double b = Input.InputCoefficients("Enter B: ");
        double c = Input.InputCoefficients("Enter C: ");
        list.add(a);
        list.add(b);
        list.add(c);

        double x1, x2, D;
        //Check coefficient at a
        if (a == 0) {
            //Check coefficient at b
            if (b == 0 && c == 0) {
                System.out.println("Empty!");
            } else if (b == 0 && c != 0) {
                System.out.println("Null!");
            } else if (b != 0 && c == 0) {
                x1 = 0;
                System.out.println("Solution: " + x1);
                list.add(x1);
            } else if (b != 0 && c != 0) {
                x1 = (-c) / b;
                System.out.println("Solution: " + x1);
                list.add(x1);
            }
        } else {
            D = b * b - 4 * a * c;
            //Check if d < 0
            if (D < 0) {
                System.out.println("Solution: Null!");
            } else {
                x1 = ((-b) + Math.sqrt(D)) / (2 * a);
                x2 = ((-b) - Math.sqrt(D)) / (2 * a);
                System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
                list.add(x1);
                list.add(x2);
            }
        }
        
        System.out.print("Odd Number:");
        //Loop through each element in list
        for (int i = 0; i < list.size(); i++) {
            //Check if odd number appear in list
            if(CheckOddNumber(list.get(i))) { 
                listOdd.add(list.get(i));
            }
        }
        //Check list the odd number is empty
        if(listOdd.isEmpty()) { 
            System.out.println("Don't have odd number");
        } else { 
            Display(listOdd);
        }
        
        System.out.print("Number is Even:");
        //Loop through each element in list
        for (int i = 0; i < list.size(); i++) {
            //Check if even number appear in list
            if(CheckEvenNumber(list.get(i))) { 
                listEven.add(list.get(i));
            }
        }
        //Check list the even number is empty
        if(listEven.isEmpty()) { 
            System.out.println("Don't have even number");
        } else {
            Display(listEven);
        }
        
        System.out.print("Number is Perfect Square:");
        //Loop through each element in list
        for (int i = 0; i < list.size(); i++) {
            //Check perfect number appear in list
            if(CheckPerfect(list.get(i))) { 
                listPerfect.add(list.get(i));
            }
        }
        //Check list perfect number is empty
        if(listPerfect.isEmpty()) { 
            System.out.println("Don't have perfect number");
        } else { 
            Display(listPerfect);
        }
    }

    private static boolean CheckOddNumber(Double n) {
        //Check number n is odd number
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void Display(List<Double> list) {
        //Loop through each element in list, except the last element
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size() - 1));
    }

    private static boolean CheckEvenNumber(Double n) {
        //Check number is even number
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean CheckPerfect(Double n) {
        //Check number is perfect number
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }
    
}
