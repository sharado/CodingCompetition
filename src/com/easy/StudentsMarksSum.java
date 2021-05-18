/*
//https://www.hackerrank.com/challenges/students-marks-sum/problem

You are given an array of integers, , denoting the marks scored by students in a class.

The alternating elements , ,  and so on denote the marks of boys.
Similarly, , ,  and so on denote the marks of girls.
The array name, , works as a pointer which stores the base address of that array. In other words,  contains the address where  is stored in the memory.

For example, let  and  stores 0x7fff9575c05f. Then, 0x7fff9575c05f is the memory address of .

//Function Description

Complete the function, marks_summation in the editor below.

marks_summation has the following parameters:

int marks[number_of_students]: the marks for each student
int number_of_students: the size of marks[]
char gender: either 'g' or 'b'
Returns

int: the sum of marks for boys if , or of marks of girls if 
Input Format

The first line contains , denoting the number of students in the class, hence the number of elements in .
Each of the  subsequent lines contains .
The next line contains .
Constraints

 (where )
 =  or 
Sample Input 0
3
3
2
5
b
Sample Output 0
8

Explanation 0

 = [3, 2, 5] and  = .

So, .

Sample Input 1
5
1
2
3
4
5
g
Sample Output 1
6

Explanation 1

 = [1, 2, 3, 4, 5] and  = 

So,  =  = .

Sample Input 2
1
5
g
Sample Output 2
0

Explanation 2

 = [5] and  = 

Here,  does not exist. So,  = .
*/

import java.util.Scanner;

public class StudentsMarksSum {

    static int marks_summation(int[] marks, String gender) {
        int sum = 0;
        int index = 0;
        if (gender == "b")
            index = 0;
        else
            index = 1;

        for (int i = index; i < marks.length; i += 2)
            sum = sum + marks[i];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student_no = sc.nextInt();
        int sum = 0;
        int marks[] = new int[student_no];

        for (int student = 0; student < student_no; student++)
            marks[student] = sc.nextInt();
        String gender = sc.next();
        sum = marks_summation(marks, gender);
        System.out.println(sum);
        sc.close();
    }
}