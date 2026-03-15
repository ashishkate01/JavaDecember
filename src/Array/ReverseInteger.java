package Array;//Write a Java program to reverse an array of integer values.

public class ReverseInteger {
    static void main(String[] args) {
        int[] arr = {2,5,6,8,9,3,6};
        int[] New = new int[arr.length];
        int j =0;
        for(int i = arr.length-1;i >=0 ; i--){
            New[j] = arr[i];
            j++;
        }
        for(int num : New)
        System.out.print(num+" ");
    }
}
