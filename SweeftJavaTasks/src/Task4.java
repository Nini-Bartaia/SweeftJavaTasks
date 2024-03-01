import java.util.Arrays;

public class Task4 {


    public int[] findIntersection(int[] nums1, int[] nums2) {
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int resIndex = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res[resIndex++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(res, resIndex);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};
        Task4 t= new Task4();
        int[] intersection = t.findIntersection(nums1, nums2);


        for (int num : intersection) {
            System.out.print(num);
        }

    }


}
