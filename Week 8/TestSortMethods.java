import java.util.Arrays;

public class TestSortMethods {
    public static void main(String[] args) {
        int[] arr = SortMethods.randomIntArray(10, 100.0);
        System.out.println("Unsorted array:");
        SortMethods.printArray(arr);

        SortMethods.selectionSort(arr);

        System.out.println("Sorted array:");
        SortMethods.printArray(arr);

        int[] copyArr = SortMethods.copyArray(arr);
        int comparisons = SortMethods.selectionSortComparisons(copyArr);
        System.out.println("Number of comparisons: " + comparisons);

        int[] sizes = { 50, 100, 250, 500, 750, 1000 };
        int[] comparisonsArr = new int[sizes.length];

        for (int index = 0; index < sizes.length; index++) {
            int[] randomArr = SortMethods.randomIntArray(sizes[index], 100.0);
            int[] copyRandomArr = SortMethods.copyArray(randomArr);
            comparisonsArr[index] = SortMethods.selectionSortComparisons(copyRandomArr);
        }

        System.out.println("Array sizes: " + Arrays.toString(sizes));
        System.out.println("Comparisons: " + Arrays.toString(comparisonsArr));
    }
}