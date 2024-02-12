package Notes.Search;

public class BinarySearch {
    // is my data sorted ?

    // 1,2,3,4,5,6,7,8,9

    // if i am looking for 7, no sense starting from 1 ? can i start from 5 ?
    // keep halfing untill no data left !
    
    // TC: O(logN)
    public static int binarySearch(int[] haystack, int needle) {
        int si = 0;
        int ei = haystack.length - 1;

        while (si < ei) {
            int mid = (si + ei) / 2;
            int value = haystack[mid];

            if (value == needle) {
                return mid;
            } else if (needle < value) {
                ei = mid - 1;
            } else if (needle > value) {
                si = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary search example!");

        int index = binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8);
        System.out.println(index);
    }
}
