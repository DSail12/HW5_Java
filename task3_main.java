// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort). (Можно использовать массивы).

package hw5_java;

import java.util.Arrays;

public class task3_main {
    public static void main(String[] args) {

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Несортированный массив:");
        System.out.println(Arrays.toString(arr));

        heapSort(arr);
        System.out.println("Сортированный массив:");
        System.out.println(Arrays.toString(arr));

    }

    public static void heapSort(int[] arr) {
        int size = arr.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            buildHeap(arr, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            buildHeap(arr, i, 0);
        }
    }

    public static void buildHeap(int[] arr, int heapSize, int rootNodeIndex) {
        int largestElementIndex = rootNodeIndex;
        int leftChildIndex = 2 * rootNodeIndex + 1;
        int rightChildIndex = 2 * rootNodeIndex + 2;

        if (leftChildIndex < heapSize && arr[leftChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        if (rightChildIndex < heapSize && arr[rightChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        if (largestElementIndex != rootNodeIndex) {
            int temp = arr[rootNodeIndex];
            arr[rootNodeIndex] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;

            buildHeap(arr, heapSize, largestElementIndex);
        }
    }
}
