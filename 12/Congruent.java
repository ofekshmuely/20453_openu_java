/* Maman 12 - course 20453 (Java A)
 * Ofek Shmuely
 * Q #2/2
 * 
 * Finding if 2 triangles are congruent by comparing their sides using their coordinates.
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class Congruent //start of class Circle
{
  public static void main(String[] args) //start of method main
  {

    Scanner scan = new Scanner(System. in );
    //getting the first coordinates
    System.out.println("Please enter the pair of the coordinates of x11 and y11:");
    double x11 = scan.nextDouble();
    double y11 = scan.nextDouble();

    //getting the second coordinates
    System.out.println("Please enter the pair of the coordinates of x12 and y12:");
    double x12 = scan.nextDouble();
    double y12 = scan.nextDouble();

    //getting the third coordinates
    System.out.println("Please enter the pair of the coordinates of x13 and y13");
    double x13 = scan.nextDouble();
    double y13 = scan.nextDouble();

    //sides of the first triangle
    double a1 = Math.abs(Math.sqrt((y12 - y11) * (y12 - y11) + (x12 - x11) * (x12 - x11)));
    double b1 = Math.abs(Math.sqrt((y13 - y11) * (y13 - y11) + (x13 - x11) * (x13 - x11)));
    double c1 = Math.abs(Math.sqrt((y13 - y11) * (y13 - y11) + (x13 - x11) * (x13 - x11)));

    //getting the fourth coordinates
    System.out.println("Please enter the pair of the coordinates of x21 and y21:");
    double x21 = scan.nextDouble();
    double y21 = scan.nextDouble();

    //getting the fifth coordinates
    System.out.println("Please enter the pair of the coordinates of x22 and y22:");
    double x22 = scan.nextDouble();
    double y22 = scan.nextDouble();

    //getting the sixth coordinates
    System.out.println("Please enter the pair of the coordinates of x23 and y23");
    double x23 = scan.nextDouble();
    double y23 = scan.nextDouble();

    //sides of the second triangle
    double a2 = Math.abs(Math.sqrt((y22 - y21) * (y22 - y21) + (x22 - x21) * (x22 - x21)));
    double b2 = Math.abs(Math.sqrt((y23 - y21) * (y23 - y21) + (x23 - x21) * (x23 - x21)));
    double c2 = Math.abs(Math.sqrt((y23 - y21) * (y23 - y21) + (x23 - x21) * (x23 - x21)));

    System.out.println("The first triangle is " + "(" + x11 + ", " + y11 + ")" + " (" + x12 + ", " + y12 + ")" + " (" + x13 + ", " + y13 + ").");
    System.out.println("Its lengths are " + a1 + ", " + b1 + ", " + c1 + ".");
    System.out.println("The first triangle is " + "(" + x21 + ", " + y21 + ")" + " (" + x22 + ", " + y22 + ")" + " (" + x23 + ", " + y23 + ").");
    System.out.println("Its lengths are " + a2 + ", " + b2 + ", " + c2 + ".");

    
    if((a1==a2 || a1==b2 || a1==c2) && (b1==a2 || b1==b2 || b1==c2) && (c1 == a2 || c1 ==b2 || c1 == c2) && (a1+b1+c1 == a2+b2+c2)){
        System.out.println("The triangles are congruent.");
    }
    else{
        System.out.println("The triangles aren't congruent.");
       }
  } // end of method main
} //end of class Congruent
