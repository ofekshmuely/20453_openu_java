/* Maman 11 - course 20453 (Java A)
 * Ofek Shmuely
 * Q #1/2
 * Finding the radius, area and the circumference of 2 circles, circle inscribed / circumscribed circle
 * 
 * In this program we are going to take input by using the Scanner & Math libary 
 * 
 */

import java.util.Scanner;
import java.lang.Math;


public class Circle //start of class Circle
{
 public static void main (String [] args) //start of method main
 {
 Scanner scan = new Scanner (System.in);
 System.out.println ("This program calculates the areas " +
 "and the perimeters of the excircle and the incircle " +
 "of a given rectangle: ");
 System.out.println ("Please enter the two coordinates of the " +
 "left-upper point of the rectangle: ");
 int leftUpX = scan.nextInt(); // top left x point of the rectangle 
 int leftUpY = scan.nextInt(); // top left y point of the rectangle 
 
 System.out.println ("Please enter the two coordinates of the " +
 "right-buttom point of the rectangle: ");
 int rightDownX = scan.nextInt(); // Down right x point of the rectangle 
 int rightDownY = scan.nextInt(); // Down right y point of the rectangle 
 
 //In circle
 double incircleRadius =  Math.abs((leftUpY-rightDownY)/2);
 double inArea = incircleRadius*incircleRadius*Math.PI;// pi*r*r
 double inPerimeter = incircleRadius*Math.PI*2; // r*pi*2

 //out circle
 double outcircleRadius = Math.sqrt((Math.pow(leftUpX-rightDownX,2)+(Math.pow(leftUpY-rightDownY,2))))/2;
 double outArea = outcircleRadius *outcircleRadius*Math.PI;// pi*r*r
 double outPerimeter = outcircleRadius *Math.PI*2; // r*pi*2
  
 
 System.out.println("Incircle: radius = " + incircleRadius + ", area =" + inArea + ", perimeter = " + inPerimeter);
 System.out.println("Excircle: radius = " + outcircleRadius + ", area =" + outArea + ", perimeter = " + outPerimeter);


 
 } // end of method main
} //end of class Circle
