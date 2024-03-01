import java.util.Arrays;

public class Task5 {

    public int maxElements(int[] arr, int target) {
        int n = arr.length;
        int res = 0;

        Arrays.sort(arr);
        int i = 0;
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            while (sum > target && i < j) {
                sum -= arr[i];
                i++;
            }
            if (sum == target) {
                res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }


}
