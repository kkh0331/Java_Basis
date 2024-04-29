package pair;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 7, 10, 4, 3, 8, 6};

        for (int i = 0; i < arr.length; i++) {
            int minValue = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
    }
}
