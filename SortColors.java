public class SortColors {

    public static void sortColors(int[] colors) {
        int low = 0, mid = 0, high = colors.length - 1;

        while (mid <= high) {
            if (colors[mid] == 0) {
                swap(colors, low++, mid++);
            } else if (colors[mid] == 1) {
                mid++;
            } else {
                swap(colors, mid, high--);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

    }
}
