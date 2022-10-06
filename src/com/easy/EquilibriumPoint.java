package CodingCompetition.src.com.easy;

import java.io.*;

public class EquilibriumPoint {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //t is for testcases
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String input[] = br.readLine().trim().split(" ");

            for(int i=0;i<n;i++)
                arr[i] = Long.parseLong(input[i]);

            Solution ob = new Solution();

            long start = System.currentTimeMillis();
            
            System.out.println(ob.equilibriumPoint(arr, n));

            long time = System.currentTimeMillis() - start;

            System.err.println(time);
        }
    }
}

class Solution {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.

    //Brute force
    /*public static int equilibriumPoint(long arr[], int n) {

        for(int i=0;i<arr.length;i++){
            long left = 0;
            long right = 0;
            
            for(int j=0;j<i;j++)
                left += arr[j];
            for(int k=i+1;k<arr.length;k++)
                right += arr[k];
            if(left == right)
                return (i+1);
        }
        return -1;       
    }*/

    //optimised code
    public int equilibriumPoint(long arr[], int n) {
        
        long suffixSum = 0;
        for(int i=0;i<arr.length;i++)
            suffixSum += arr[i];

        long prefixSum = 0;

        for(int i=0;i<arr.length;i++){
            suffixSum -= arr[i];

            if(prefixSum == suffixSum)
                return (i+1);

            prefixSum += arr[i];
        }
        return -1;
    }
}