package Array; ////Find kth largest and smallest element  in array
//
//import java.util.Scanner;
//
//public class FindKlargestElement {
//    static void main(String[] args) {
//        int[] arr = {45,76,98,67,99,89};
//        int min = 0;
//        int max = arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(max != arr.length){
//                int temp = arr[min];
//                arr[min] = arr[max];
//                arr[max]= temp;
//                min++;
//                max++;
//            }
//        }
//
//        System.out.println(" Smallest element : "+min);
//        System.out.println(" Largest Element : "+max);
//
//    }
//}
import java.util.Arrays;

public class FindKlargestElement {
    public static void main(String[] args) {

        int[] arr = {16, 25, 37, 58, 87, 56};
        int k = 2;

        Arrays.sort(arr);

        System.out.println("Kth Smallest = " + arr[k - 1]);
        System.out.println("Kth Largest = " + arr[arr.length - k]);
    }
}
