package com.easy;

import java.util.*;

public class MagicWand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input N and M
        int n = input.nextInt();
        int m = input.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Input queries
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = input.nextInt();
        }

        // Calculate costs
        int[] costs = new int[m];
        for (int i = 0; i < m; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                cost += Math.abs(arr[j] - queries[i]);
            }
            costs[i] = cost;
        }

        // Print costs
        for (int i = 0; i < m; i++) {
            System.out.print(costs[i] + " ");
        }
    }
}
