/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

/**
 *
 * @author admin
 */
class Calculator {

    static void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        double memory = GetInput.InputNumber("Enter number: ");
        //Loop until user enter operator "="
        while (true) {
            String operator = GetInput.InputOperator("Enter Operator: ");
            switch (operator) {
                case "+":
                    double number1 = GetInput.InputNumber("Enter number: ");
                    memory += number1;
                    System.out.println("Memory:" + memory);
                    break;
                case "-":
                    double number2 = GetInput.InputNumber("Enter number: ");
                    memory -= number2;
                    System.out.println("Memory:" + memory);
                    break;
                case "*":
                    double number3 = GetInput.InputNumber("Enter number: ");
                    memory *= number3;
                    System.out.println("Memory:" + memory);
                    break;
                case "/":
                    //Loop re-enter if input value is invalid
                    while (true) {
                        double number4 = GetInput.InputNumber("Enter number: ");
                        //Check input value
                        if (number4 == 0) {
                            System.out.println("Not divide 0");
                        } else {
                            memory /= number4;
                            System.out.println("Memory:" + memory);
                            break;
                        }
                    }
                    break;
                case "^":
                    double number5 = GetInput.InputNumber("Enter number: ");
                    memory = Math.pow(memory, number5);
                    System.out.println("Memory:" + memory);
                    break;
                case "=":
                    System.out.println("Result:" + memory);
                    break;
            }
            //Check input operator of user
            if(operator.equals("=")) {
                break;
            }            
        }
    }

    static void bmiCalculator() {
        double weight = GetInput.InputWeightHeight("Enter Weight(kg): ");
        double height = GetInput.InputWeightHeight("Enter Height(cm): ");
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI Number: %.2f\n", bmi);
        System.out.print("BMI Status: ");
        //Check bmi of user
        if (bmi < 19) {
            System.out.println("UNDER STANDARD");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("STANDARD");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("OVERWEIGHT");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("FAT SHOULD LOSE WEIGHT");
        } else if (bmi > 40) {
            System.out.println("VERY FAT SHOULD LOSE WEIGHT IMMEDIATELY");
        }
    }
}
