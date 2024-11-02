
import java.util.Arrays;

public class FindMidEleChat {
    public static void main(String[] args) {
        int[] nums2 = {1, 3, 4};
        int[] nums1 = {2, 5, 6};

        int[] mergedArray = mergeSortedArrays(nums1, nums2);

        // Print the merged array
        System.out.print("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(" " + num);
        }

        int Len = mergedArray.length;
        System.out.println("\nLength of merged array: " + Len);

        if (Len % 2 != 0) {
            // Odd length, middle element directly
            int midElement = mergedArray[Len / 2];
            System.out.println("Middle element: " + midElement);
        } else {
            // Even length, average of the two middle elements
            int mid1 = mergedArray[Len / 2 - 1];
            int mid2 = mergedArray[Len / 2];
            System.out.println("2 Middle elements: " + mid1 + " and " + mid2);
            System.out.println("2 Average of middle elements: " + (mid1 + mid2) / 2.0);
        }
    }

    public static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] <= nums2[j]) {
        //         mergedArray[k++] = nums1[i++];
        //     } else {
        //         mergedArray[k++] = nums2[j++];
        //     }
        // }
        // Copy remaining elements from nums1, if any
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        // Copy remaining elements from nums2, if any
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
