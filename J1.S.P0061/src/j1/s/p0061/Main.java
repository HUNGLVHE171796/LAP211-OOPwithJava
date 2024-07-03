/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0061;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        //Step1: Display GUI
        displayGui();
        //Step2: Input information of Rectangle
        Rectangle rectangle = Management.enterInforRectangle();
        //Step3: Input information of Circle
        Circle circle = Management.enterInforCircle();
        //Step4: Input information of Triangle
        Triangle triangle = Management.enterInforTriangle();
        //Step5: Display result
        Management.displayResult(rectangle, circle, triangle);
    }

    private static void displayGui() {
        System.out.println("=====Calculator Shape Program=====");
    }

}
