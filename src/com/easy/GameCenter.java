// Game Center (100 Marks)
// You and your friend go to a game arcade where you choose to play the game Lucky Pick. In the game, there is a square grid and on each block, some money is placed on it. When a player chooses a block, the machine randomly chooses a block from the neighboring ones and the chosen block (consider 8 neighborhood). The player is awarded the money that is placed on the block that the machine selects. Your friend needs help choosing the block.

// Your job is to return the block position(s) that will maximize the minimum amount your friend will win for sure. If there are more than one such block positions then the output must return for all these positions.


// Input Format
// You will be given the Grid Description as -
// The first line consists of the size of the square grid (N)
// The next N lines each containing N numbers separated by '#', each number representing the amount of money put on that block



// Constraints
// 1 < N < 500


// Output Format
// You need to print the array of string containing the position(s) of a block choosing which will give the maximum amount of money which your friend will definitely win.


// Sample TestCase 1
// Input
// 3
// 12#45#33
// 94#54#23
// 98#59#27
// Output
// 3#1
// Explanation
// In the above example, if he selects the block (3,1), then under the best case, he could win is 98 and under the worst case the maximum he could win is 54. In such scenario, the worst case of block (3,1) gives your friend more money than the worst case of other blocks.

 
// Sample TestCase 2
// Input
// 4
// 12#45#33#27
// 94#54#23#53
// 98#59#27#62
// 11#51#67#13
// Output
// 1#3
// 1#4
// 2#3
// 2#4
// Explanation
 

// Note: If the output array contains multiple strings(block's positions), all the positions must be in the row-wise traversal order. In Example 2, the output is {1#3,1#4,2#3,2#4}. If your function is returning an array that has same elements (block's position) but in the different order, then the output array will be incorrect.



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] row = sc.next().split("#");
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }
        List<String> positions = new ArrayList<>();
        int maxMinAmount = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int minAmount = Integer.MAX_VALUE;
                for (int k = Math.max(0, i - 1); k <= Math.min(n - 1, i + 1); k++) {
                    for (int l = Math.max(0, j - 1); l <= Math.min(n - 1, j + 1); l++) {
                        minAmount = Math.min(minAmount, grid[k][l]);
                    }
                }
                if (minAmount > maxMinAmount) {
                    maxMinAmount = minAmount;
                    positions.clear();
                    positions.add((i + 1) + "#" + (j + 1));
                } else if (minAmount == maxMinAmount) {
                    positions.add((i + 1) + "#" + (j + 1));
                }
            }
        }
        for (String pos : positions) {
            System.out.println(pos);
        }
    }
}

// Explanation:

// Read the input from the user - the size of the square grid and the values of the grid.
// Loop through all the blocks in the grid and for each block, find the minimum value among its 8 neighbors.
// Keep track of the maximum minimum value seen so far and the positions of the blocks that have that value.
// Print the positions of the blocks that have the maximum minimum value.
// The time complexity of this algorithm is O(n^4) which may not be efficient for very large values of n, but it should be sufficient for the constraints given in the problem statement.
// }
