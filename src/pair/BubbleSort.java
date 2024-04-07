package pair;

import java.util.Arrays;
import java.util.Random;

// 페어프로그래밍 첫 번째,
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = createArr(100000);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        sort(arr);
//        for(int i : arr){
//            System.out.println(i);
//        }

        sort2(arr2);
    }

    public static void sort(int[] arr){
        long startTime = System.nanoTime();
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        long endTime = System.nanoTime();
        System.out.println("Execution time in seconds: "+ (endTime - startTime)/1000000000);
    }

    public static void sort2(int[] arr){
        long startTime = System.nanoTime();
        for(int i=0; i < arr.length; i++){
            boolean isSorted = true;
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]) {
                    isSorted = false;
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
            if(isSorted) break;
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time in seconds: "+ (endTime - startTime)/1000000000);
    }

    public static int[] createArr(int n){
        int[] arr = new int[n];

        Random random = new Random();

        for(int i=0; i<n; i++){
            arr[i] = random.nextInt(n*10);
        }

        return arr;
    }
}
