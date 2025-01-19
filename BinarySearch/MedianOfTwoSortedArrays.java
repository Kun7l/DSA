import java.util.ArrayList;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] > nums2[right]) {
                arr.add(nums2[right]);
                right++;
            } else {
                arr.add(nums1[left]);
                left++;
            }
        }
        if (left != nums1.length) {
            for (int i = left; i < nums1.length; i++) {
                arr.add(nums1[i]);
            }
        }
        if (right != nums2.length) {
            for (int i = right; i < nums2.length; i++) {
                arr.add(nums2[i]);
            }
        }
        System.out.println(arr);
        if (arr.size() % 2 != 0)
            return arr.get(arr.size() / 2);

        return ((arr.get((arr.size() - 1) / 2) + (arr.get(arr.size()/2))) / 2.0);

    }
}
