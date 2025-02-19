import java.util.*;

class Solution {
    public int[] twoSum(int[] list, int target) {
        int n = list.length; // Define `n`
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[i] + list[j] == target) {
                    return new int[]{i, j}; // Return indices instead of printing
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public static void main(String[] args) { // `String` instead of `str`
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] list = new int[n]; // Use an array instead of ArrayList
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        // Read target value
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Call the function
        Solution obj = new Solution();
        int[] result = obj.twoSum(list, target);

        // Print result
        if (result.length > 0) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }
}

