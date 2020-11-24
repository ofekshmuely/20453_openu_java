/*
 * Maman 11 - course 20453 (Java A)
 * Ofek Shmuely
 * Q #2/2
 * 
 * finding the min & max heart rates of a user by his age for a sport activity 
 * 
 * 
 */

import java.util.Scanner;
public class HeartRate
{
 public static void main (String [] args)
 {
 final int CONST = 220;
 final int lowerHeartRate = 65; // lowest percentage 65% of 220-age
 final int HigherHeartRate = 85;  // highest percentage 85% of 220-age

 
 Scanner scan = new Scanner (System.in);
 System.out.println ("This program calculates your " +
 "target heart rate while exercising ");
 System.out.print ("Enter your age: ");
 int age = scan.nextInt();
 int userMinHeartRate = ((CONST-age)*lowerHeartRate)/100;
 int userMaxHeartRate = ((CONST-age)*HigherHeartRate)/100;
 
 System.out.println("Your estimated target heart rate zone is " + userMinHeartRate + " - " + userMaxHeartRate + " beats per minute." );

} // end of method main
} //end of class HeartRate
