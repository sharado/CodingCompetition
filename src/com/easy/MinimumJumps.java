package com.easy;

import java.io.*;

public class MinimumJumps {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];

        String input[] = br.readLine().trim().split(" ");

        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(input[i]);

        System.out.println(new Solutions().minJumps(arr));
    }
}

class Solutions {
    public int minJumps(int arr[]){
        
        if (arr.length <= 1) 
            return 0;
  
        if (arr[0] == 0)  // Return -1 if not possible to jump 
            return -1; 
  
        int maxReach = arr[0]; 
        int step = arr[0];
        int jump = 1;
  
        for (int i = 1; i < arr.length; i++) 
        { 
            if (i == arr.length - 1)  // Check if we have reached the end of the array 
                return jump; 
  
            maxReach = Math.max(maxReach, i+arr[i]);  // updating maxReach
  
            step--;  // we used a step to get to the current index 
  
            if (step == 0) // If no further steps left 
            {
                jump++; //  we must have used jump 
                   
                if(i>=maxReach)  //Check if the current index/position  or lesser index is the maximum reach point from the previous indexes 
                   return -1;
  
                step = maxReach - i; // re-initialize the steps to the amount of steps to reach maxReach from position i.
            } 
        }
        return -1;
    }
}
//  I/P:            10
//  Elements:       2 3 1 1 2 4 2 0 1 1
//  Correct O/P:    4   [2 to 3]
//                         [3 to 2]
//                         [2 to 4] reached end
                        