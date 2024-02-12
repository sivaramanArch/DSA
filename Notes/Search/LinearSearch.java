package Notes.Search;

public class LinearSearch {

    public static int linearSearch(int[] nums, int toFind) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        int index = linearSearch(new int[] { 1, 2, 3, 4, 5, 6 }, 00);
        System.out.println(index);
    }

}