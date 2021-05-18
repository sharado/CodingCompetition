/* Read input from STDIN. Print your output to STDOUT*/

import java.util.*;
public class Pattern {
   public static void main(String args[] ) throws Exception {

	  Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      for(int i=1;i<=input;i++){
        for(int j=1;j<=input;j++){
            if(j==input)
                System.out.print((char)(i+64));
            else
                System.out.print((char)(i+64) + " ");
        }
        System.out.println();
      }
      sc.close();
   }
}
         