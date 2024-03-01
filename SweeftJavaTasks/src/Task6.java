public class Task6 {

    public boolean isValidSequence(int[] arr, int[] sequence) {
        int arrLength = arr.length;
        int sequenceLength = sequence.length;
        if (arrLength < sequenceLength) {
            return false;
        }

        int[] arr3 = new int[sequenceLength];

        int i = 0;
        int j=0;
        int match = 0;


        while (i < arrLength && match < sequenceLength) {
            if (arr[i] == sequence[j]) {
                arr3[match] = i;
                match++;
                j++;
            }
            i++;
        }

        if (match < sequenceLength) {
            return false;
        }

        for (int k = 1; k < sequenceLength; k++) {
            if (arr3[k] <= arr3[k - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,1,22,25,6,-1,8,10};
        int[] sequence = new int[]{1,6-1,10};

        Task6 task= new Task6();

        System.out.println(task.isValidSequence(array,sequence));
    }
}
