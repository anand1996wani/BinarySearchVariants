/*

Given a sorted array with repeating integers. You need to find the first occurence , last occurence and count of a given key in the array. USE ONLY BINARY SEARCH. Your algorithm should run in LogN time.If element is not present print -1 -1 0.

Input Format

First line contains N , then N integers in next line , then key in the next line.

Constraints

N<=1000000

Output Format

3 space separated integers for lower bound , upper bound and count/frequency of that key.

Sample Input

6

1 2 2 2 3 4

2

Sample Output

1 3 3

Explanation

First occurence of 2 is at 1. Second Occurence of 2 is at 3. Count is 3.


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        
        int low = 0,high = n - 1;
        int first = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(array[mid] == key){
                first = mid;
                high = mid - 1;
            }else if(array[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        low = 0;
        high = n - 1;
        int second = -1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(array[mid] == key){
                second = mid;
                low = mid + 1;
            }else if(array[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        if(first == -1 && second == -1){
            System.out.println("-1 -1 0");    
        }else{
            int count = second - first + 1;
            System.out.println(first + " " + second + " " + count);
        }
    }
}
