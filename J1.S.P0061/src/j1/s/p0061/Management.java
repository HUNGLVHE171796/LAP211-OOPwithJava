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
class Management {

    static Rectangle enterInforRectangle() {
        double width = GetInput.getNumber("Please input side width of Rectangle:");
        double length = GetInput.getNumber("Please input length of Rectangle:");
        Rectangle rectangle = new Rectangle(width, length);
        return rectangle;
    }

    static Circle enterInforCircle() {
        double radius = GetInput.getNumber("Please input radius of Circle:");
        Circle circle = new Circle(radius);
        return circle;
    }

    static Triangle enterInforTriangle() {
        //repeat until the user enters side sastify triangle
         while(true) { 
             double sideA = GetInput.getNumber("Please input side A of Triangle:");
             double sideB = GetInput.getNumber("Please input side B of Triangle:");
             double sideC = GetInput.getNumber("Please input side C of Triangle:");
             //Check validation of triangle
            //Condition about side of triangle is valid then create new triangle
            if (isValidTriangle(sideA, sideB, sideC)) {
                Triangle triangle = new Triangle(sideA, sideB, sideC);
                return triangle;
            } 
            //otherwise tell erorr
            else {
                System.out.println("The triangle is not valid. Please enter valid side lengths.");
            }
         }
    }

    static void displayResult(Rectangle rectangle, Circle circle, Triangle triangle) {
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }

    private static boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB);
    }
    
}
