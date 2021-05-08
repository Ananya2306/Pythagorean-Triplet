// Importing the Java.io Package
import java.io.*;

// Name the class
class Main {

  public static void main(String args[]) throws IOException
  // to remove input/output errors

  {

    // Making InputStreamReader Object
    InputStreamReader read = new InputStreamReader(System.in);
    // Making BufferedReader Object
    BufferedReader br = new BufferedReader(read);

    // Taking input value From the user to find Pythagorean triplet
    System.out.print("Enter the value of m: ");
    // Storing the input value in a variable
    int m = Integer.parseInt(br.readLine());

    // Making if condition
    // That the input number 'm' should not be less then 2 / should be greater than
    // 1
    // If m is less than two then display a message
    if (m < 2) {
      System.out.println("Invalid Input, m should be greater than 1");
    }
    // Making else condition
    // That if the input number 'm' is greater than 1
    // So Find the Pythagorean Triplet
    else {

      // To find First Triplet
      int firstTriplet = 2 * m;

      // To find Second Triplet
      int secondTriplet = (int) (Math.pow(m, 2) - 1);

      // To find Third Triplet
      int thirdTriplet = (int) (Math.pow(m, 2) + 1);

      // Displaying all the triplet(Pythagorean Triplet)
      System.out.println("Pythagorean Triplets: " + firstTriplet + ", " + secondTriplet + ", " + thirdTriplet);

    }

  }

}