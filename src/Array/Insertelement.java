package Array;

////Write a Java program to insert an element (specific position) into an array.
//
//import java.util.Scanner;
//
//public class Insertelement {
//    static void main() {
//        int[] arr = {2,4,5,6,7,8,9};
//
//        int element  = 25;
//        int position = 2;
//
//        int[] newarr = new  int[arr.length+1];
//
//        for (int i = 0 , j = 0; i<newarr.length;i++){
//            if (i == position){
//                newarr[i] = element;
//            }else {
//                newarr[i] = arr[j];
//                j++;
//            }
//        }
//       for (int num : newarr)
//        System.out.println( newarr +" ");
//
//}}
public class Insertelement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int element = 25;
        int position = 2; // index position (0-based)

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {

            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        // Print new array
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
