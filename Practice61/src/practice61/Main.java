/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice61;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //Step1: Display GUI
        displayGui();
        //Step2: Enter information of Rectangle
        Rectangle rectangle = Management.enterInforRectangle();
        //Step3: Enter information of Circle
        Circle circle = Management.enterInforCircle();
        //Step4: Enter information of Triangle
        Triangle triangle = Management.enterInforTriangle();
        //Step5: Display result
        Management.displayResult(rectangle, circle, triangle);
    }

    private static void displayGui() {
        System.out.println("=====Calculator Shape Program=====");
    }
}
