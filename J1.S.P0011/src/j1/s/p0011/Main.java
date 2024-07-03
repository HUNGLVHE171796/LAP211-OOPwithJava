/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ChangeBase convert = new ChangeBase();
        while (true) {
            //Step1: Enter base number input
            int baseInput = GetInput.enterBaseNumberInput();
            //Step2: Enter base number output
            int baseOutput = GetInput.enterBaseNumberOutput();
            //Step3: Enter input value
            String value = GetInput.enterInputValue(baseInput);
            //Step4: Convert all to dec
            String result = convert.convertValue(value, baseInput, baseOutput);
            //Step5: Print out value
            printOutputValue(result);
        }
    }

    private static void printOutputValue(String result) {
        System.out.println("Value output: " + result);
    }
}
