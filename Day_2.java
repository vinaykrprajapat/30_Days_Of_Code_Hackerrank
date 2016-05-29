import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
       double tip = tipPercent * (mealCost / 100) ;
        double tax = taxPercent * (mealCost / 100) ;
        // cast the result of the rounding operation to an int and save it as totalCost 
        double TotalCost = mealCost + tip + tax;
        int totalCost = (int) Math.round(TotalCost);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}

