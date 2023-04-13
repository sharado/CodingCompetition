package com.easy;

import java.io.*;
import java.util.Arrays;

public class ForestFire {

    public static long minimum(long arr[], int N, int X) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] >= arr[N - X]) {
                count++;
            } else {
                break;
            }
        }
        if (count == X) {
            return arr[N - X];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().trim().split(" ");
        int N = Integer.parseInt(in[0]);
        int X = Integer.parseInt(in[1]);
        long arr[] = new long[N];
        String input[] = br.readLine().trim().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(input[i]);
        }
        System.out.println(minimum(arr, N, X));
    }
}
