/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0009;

/**
 *
 * @author admin
 */
public class J1SP0009 {

    public static void main(String[] args) {
        //Step1: Find 45 fibonacci sequence by recursion
        int fiboSeq[] = new int[45];
        boolean test = false;
        findFibonacciSequence(fiboSeq, 0, test);
        //Step2: Display 45 fibonacci sequence
        display45Fibonacci(fiboSeq);
    }

    private static void findFibonacciSequence(int[] fiboSeq, int index, boolean test) {
        //recursive stop condition
        if(index == fiboSeq.length) {
            return;
        }
        //Base case: check if index = 0 or index = 1
        if(index <=1) { 
            fiboSeq[index] = index;
            //test algoritm
            if(test == true) { 
                System.out.println("Fibo(" + index + ") = " + index);
            }
        } else {
            fiboSeq[index] = fiboSeq[index - 1] + fiboSeq[index - 2];
            //test algorithm
            if(test == true) { 
                System.out.println("Fibo(" + index + ") = " + fiboSeq[index - 1] + " + " + fiboSeq[index - 2] + " = " + fiboSeq[index]);
            }
        }
        index++;
        //recursive
        findFibonacciSequence(fiboSeq, index, test);
    }

    private static void display45Fibonacci(int[] fiboSeq) {
        System.out.println("The 45 sequence fibonacci:");
        //Loop through each element in array, except the last element
        for (int i = 0; i < fiboSeq.length - 1; i++) {
            System.out.print(fiboSeq[i] + ", ");
        }
        System.out.println(fiboSeq[fiboSeq.length - 1]);
    }
}
