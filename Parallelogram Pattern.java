/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****


*/

import java.util.Scanner;
public class Main {
	
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
