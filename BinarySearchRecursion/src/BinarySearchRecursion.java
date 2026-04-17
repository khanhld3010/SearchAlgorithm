public class BinarySearchRecursion {
    int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
