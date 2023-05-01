import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/10;
        int c = a%10;
        int d = (b*c)+(b+c);
        if(9 < a && a < 100){
            if(a==d){
                System.out.println("Special two digit number");
            }else{
                System.out.println("Not a special two digit number");
            }
        }else{
            System.out.println("Invalid Input");
        }
        
    }
}