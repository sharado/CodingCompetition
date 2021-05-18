/*
// https://www.hackerrank.com/challenges/recursion-in-c/problem

There is a series, , where the next term is the sum of pervious three terms. Given the first three terms of the series, , , and  respectively, you have to output the nth term of the series using recursion.

Recursive method for calculating nth term is given below.

Input Format

The first line contains a single integer, .

The next line contains 3 space-separated integers, , , and .

Constraints

Output Format

Print the nth term of the series, .

Sample Input 0
5
1 2 3

Sample Output 0
11

Explanation 0

Consider the following steps:

From steps , , , and , we can say ; then using the values from step , , , and , we get . Thus, we print  as our answer.

*/

import java.util.Scanner;

public class CalculateNthTerm {

    static int find_nth_term(int n, int a, int b, int c) {
        if (n == 1)
            return a;
        else if (n == 2)
            return b;
        else if (n == 3)
            return c;
        return (find_nth_term(n - 1, a, b, c) + find_nth_term(n - 2, a, b, c) + find_nth_term(n - 3, a, b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int summation = find_nth_term(n, a, b, c);

        System.out.println(summation);
        sc.close();
    }
}