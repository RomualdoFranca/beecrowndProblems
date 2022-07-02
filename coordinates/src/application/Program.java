package application;

import entities.CoordinatesOfAPoint;

import java.util.Scanner;

/*  Write an algorithm that reads two floating values (x and y), which should represent the coordinates of a point in a plane.
    Next, determine which quadrant the point belongs, or if you are at one of the Cartesian axes or the origin (x = y = 0).
    If the point is at the origin, write the message "Origem".
    If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".
    Input
     The input contains the coordinates of a point.
    Output
    The output should display the quadrant in which the point is.
*/
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a coordenada X: ");
        double pointX = sc.nextDouble();
        System.out.println("Informe a coordenada Y: ");
        double pointY = sc.nextDouble();
        CoordinatesOfAPoint coordinatesOfAPoint = new CoordinatesOfAPoint(pointX, pointY);
        System.out.println(coordinatesOfAPoint.quadrant());
        sc.close();
    }
}