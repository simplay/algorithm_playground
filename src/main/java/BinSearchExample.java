import java.util.Arrays;

public class BinSearchExample {

    public BinSearchExample(int value) {

        int n = 100;
        int[] list = new int[n];

        for (int k = 0; k < n; k++) {
            list[k] = (int)(Math.random() * 100);
        }
        Arrays.sort(list);

        int start = 0;
        int end = list.length - 1;

        if (binSearchContains(list, value, start, end)) {
            int idx = binSearch(list, value, start, end);
            System.out.println("Value " + value + " is at index " + idx);
        } else {
            System.err.println("List does not contain element " + value);
        }
    }

    /**
     * Checks whether a given value is included in a int array.
     *
     * @param list list of ascending sorted integers
     * @param value search value
     * @param startIdx first index lookup positions
     * @param endIdx last index lookup position
     * @return true, if lookup value is included.
     */
    public boolean binSearchContains(int[] list, int value, int startIdx, int endIdx) {
        int idxCenter = ((startIdx + endIdx) / 2);
        if (endIdx < startIdx) {
            return false;
        }
        if (list[idxCenter] == value) {
            return true;
        } else if (list[idxCenter] > value) {
            return binSearchContains(list, value, startIdx, idxCenter - 1);
        } else {
            return binSearchContains(list, value, idxCenter + 1, endIdx);
        }
    }

    /**
     * Find the index of value in the list
     * @param list
     * @param value
     * @param startIdx
     * @param endIdx
     * @return
     */
    public int binSearch(int[] list, int value, int startIdx, int endIdx) {
        int idxCenter = ((startIdx + endIdx) / 2);
        if (endIdx < startIdx) {
            return -1;
        }
        if (list[idxCenter] == value) {
            return idxCenter;
        } else if (list[idxCenter] > value) {
            return binSearch(list, value, startIdx, idxCenter - 1);
        } else {
            return binSearch(list, value, idxCenter + 1, endIdx);
        }
    }

}
