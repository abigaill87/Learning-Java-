public class Practiceproblems {
    // Practice Problem 1
    static int countOccurences(int[] arr, int n) {
        int x = 0;
        for (int i : arr) {
            if (i == n) {
                x++;
            }
        }
        return x;
    }

    // Practice Problem 2
    static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }

    // Practice Problem 3
    static double sumGrid(double[][] grid) {
        double x = 0.0;
        for (int i = 0; i < grid[i].length; i++) {
            for (int j = 0; j < grid[j].length; j++) {
                x += grid[i][j];
            }
        }
        return x;
    }

    // Practice Problem 4
    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            int[] fib = new int[n+1];
            fib[i] = fib[i - 1] + fib[i - 2];
        }
          
    }return fib[n];
}
