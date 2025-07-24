public class Practiceproblems {

    static int countOccurences(int[] arr, int n) {
        int x = 0;
        for (int i : arr) {
            if (i == n) {
                x++;
            }
        }
        return x;
    }
}
