/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
*/




import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0; i<n; i++){
		for(int j=0; j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
	}	
    
//     OR
    /*
     int currRow=1;
   while(currRow<=n){
	   int currCol=1;
	   while(currCol<=currRow){
         System.out.print("*");
		 currCol++;
	   }
	   System.out.println();
	   currRow++;
   }

    */
    
//     OR
    
    /*
    	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=n; i>=0; i--){
		for(int j=n-i; j>0; j--){
			System.out.print("*");
		}
		System.out.println();
	}	
    */
	
		
	}

}
