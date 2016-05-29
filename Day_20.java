// Day 20: Sorting

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int totalSwaps = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
            int temp;
            temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
  //          swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
    
    if (numberOfSwaps == 0) {
        break;
    }
             totalSwaps = totalSwaps + numberOfSwaps;
}
 System.out.println("Array is sorted in "+totalSwaps+" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[n-1]);
    }
}



