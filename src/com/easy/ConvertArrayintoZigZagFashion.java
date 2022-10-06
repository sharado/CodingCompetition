package com.easy;

import java.io.*;

public class ConvertArrayintoZigZagFashion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String input[] = br.readLine().trim().split(" ");
            
            int arr[] = new int[n];

            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(input[i]);
            
            new Solution().zigZag(arr, n);
            for(int i=0;i<n;i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Solution{
    public void zigZag(int arr[], int n) {
        for(int i=0;i<(n-1);i++){
            if((i%2 != 0 && arr[i]<arr[i+1]) || (i%2 == 0 && arr[i]>arr[i+1])){
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }
        
    }
}