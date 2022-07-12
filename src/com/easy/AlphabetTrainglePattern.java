package CodingCompetition.src.com.easy;

/*
Pattern Problem - 41 (100 Marks)
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
            A
         A B C
      A B C D E
   A B C D E F G
A B C D E F G H I 

Input Format
You will take an integer input n from stdin.

Constraints
1 <= n <= 26

Output Format
Your output should be the pattern according to the input which you had entered. 

Sample TestCase 1
Input
5
Output
        A
      A B C
    A B C D E
  A B C D E F G
A B C D E F G H I

*/

import java.util.Scanner;

public class AlphabetTrainglePattern {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i=1;i<=n;i++){
         for(int j=0;j<(n-i)*2;j++)
            System.out.print(" ");
         for(int j=1;j<=i;j++)
         {
            if(j!=i)
               System.out.print((char)(j+64) + " ");
            else
               System.out.print((char)(j+64));
         }
         for(int k=i+1;k<=(i*2-1);k++)
               System.out.print(" " + (char)(k+64));
         System.out.println();
      }
    }
}