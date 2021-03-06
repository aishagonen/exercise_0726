package lab6;

import java.util.Scanner;

public class Temperature {

	private double fahrenheit;
	
	public Temperature(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getCelcius() {
		return  ((double) 5/9 * fahrenheit) -32;
		
	}
	
	public double getKelvin() {
		return  ((double) 5/9 * (fahrenheit -32)) + 273;
	
	}
	
	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public static void main(String[] args) {

		double fahrenheit; // To hold a temperature in fahrenheit

	      // Create a Scanner object for keyboard input.
	       Scanner keyboard = new Scanner(System.in);
	       
	       // Get the temperature.
	       System.out.print("Enter the fahrenheit: ");
	       fahrenheit = keyboard.nextDouble();
	       
	       Temperature temp = new Temperature(fahrenheit);

	       // Get the data from the class and display it.
	       System.out.println();
	       System.out.println("Here is the Temperatures : ");
	       System.out.println("Fahrenheit: " + temp.getFahrenheit());
	       System.out.println("Celcius: " + temp.getCelcius());
	       System.out.println("Kelvin: " + temp.getKelvin());

	}

}
