
/* Maman 12 - course 20453 (Java A)
 * Ofek Shmuely
 * Q #1/2
 * Converting an input of a temperature, by a char + value
 * 
 * Example-> User input: F 100
 * 37.78 C
 * 100.0 F
 * 310.93 K
 * 
 */

import java.util.Scanner; // import of the Scanner class 
import java.lang.Math; // import of java Math

public class Temperature {  //start of class Temperature
  public static void main(String args[]) { //start of method main
    Scanner scan = new Scanner(System. in );

    System.out.println("This program is converting the temperature " + "and displaying it as celsius, fahrenheit and kelvin.");
    System.out.println("Please enter a char (c for celsius, f for fahrenheit ,k for kelvin) " + "and your temperature : ");
    
    //getting the user's input of the temperature type and the value of it with scanner
    char temperatureType = scan.next().charAt(0);
    double tempValue = scan.nextDouble();
    
    //coverting celsius to fahrenheit and kelvin
    final double celsiusToFahrenheit = tempValue * 9 / 5 + 32;
    final double celsiusToKelvin = tempValue + 273.15;
    
    // converting fahrenheit to celsius and kelvin
    final double fahrenheitToCelsius = (tempValue - 32) / 1.8;
    final double fahrenheitToKelvin = (tempValue + 459.67) * 5 / 9;
    
    //converting kelvin to celsius and fahrenheit
    final double kelvinToCelsius = tempValue - 273.15;
    final double kelvinToFahrenheit = tempValue * 9 / 5 - 459.67;

    if (temperatureType == 'c' || temperatureType == 'C') {
      System.out.println(tempValue + " C");
      System.out.println(celsiusToFahrenheit + " F");
      System.out.println(celsiusToKelvin + " K");

    }

    else if (temperatureType == 'f' || temperatureType == 'F') {
      System.out.println(fahrenheitToCelsius + " C");
      System.out.println(tempValue + " F");
      System.out.println(fahrenheitToKelvin + " K");

    }

    else if (temperatureType == 'k' || temperatureType == 'K') {
      System.out.println(kelvinToCelsius + " C");
      System.out.println(kelvinToFahrenheit + " F");
      System.out.println(tempValue + " K");

    }

    else {
      System.out.println("Something is wrong...");
    }

  } //end of method main
}//end of class Temperature
