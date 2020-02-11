/*

Binary Search - Basic



*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int low = 0, high = n - 1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high)/2;
            if(array[mid] == key){
                System.out.println(mid);
                found = true;
                break;
            }else if(array[mid] < key){
                low = mid + 1;    
            }else{
                high = mid - 1;
            }
        }
        if(!found)
            System.out.println(-1);
    }
}
