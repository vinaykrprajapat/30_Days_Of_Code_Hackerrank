// Binary Numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    System.out.println(getMaxOfBinary(i));
}
private static int getMaxOfBinary(int i) {
   int max = 0;
    ArrayList<Integer> tempMax = new ArrayList<>();
    int currentmax = 0;
    boolean stop = true;
    while ( stop ) {
        if( i%2 == 1){
            max++;
        }
        if(i % 2 == 0 || i ==1) {
            tempMax.add(max);
            max = 0;
        }
        if(i ==1 ){
            stop = false;
        }
        i= i/2;
    }
    return Collections.max(tempMax);

}
}
