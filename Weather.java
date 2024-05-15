import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
     // Declare and initialize an array of temperatures in Celsius
    double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
    // Call the celciusToFahrenheit method to convert Celsius temperatures to Fahrenheit
    double[] fahrenheit = celciusToFahrenheit(celsius);
    // Print the Celsius temperatures using Arrays.toString() method
    System.out.println("Celsius: " + Arrays.toString(celsius));
    // Print the Fahrenheit temperatures using Arrays.toString() method
    System.out.println("Fahrenheit: " + Arrays.toString(fahrenheit));
    
    // Call the printTemps method to print Celsius temperatures
    printTemps(celsius, "celsius");
     // Call the printTemps method to print Fahrenheit temperatures
    printTemps(fahrenheit, "fahrenheit");
   
    }
    // Method to convert Celsius temperatures to Fahrenheit
    public static double[] celciusToFahrenheit(double[] celsius) {
    // Create a new array to store Fahrenheit temperatures with the same length as the Celsius array
    double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
    // Iterate through each element of the Celsius array
    for (int x = 0; x < celsius.length; x++) {
    // Convert Celsius temperature to Fahrenheit using the formula (C * 9/5) + 32
    fahrenheit[x] = celsius[x] * 9 / 5 + 32;

    }
    // Return the array of Fahrenheit temperatures
    return fahrenheit;
        
    }

    // Method to print temperatures
    public static void printTemps(double[] temp, String tempType) {
    // Print the type of temperature (Celsius or Fahrenheit)
    System.out.println(tempType + ". ");

    // Iterate through each temperature in the array
    for (int y = 0; y < temp.length; y++) {
    // Print each temperature
    System.out.println(temp[y] + ". ");

    }

    }
    
    }


