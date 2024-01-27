package DSA_Roadmap;

public class SecondLargestInArray {
    static int findSecondLargest(int n, int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            else if (secondMax < arr[i] && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        var res = findSecondLargest(5, new int[] { 1, 2, 3, 4, 5 });
        assert res == 5;
    }
}
