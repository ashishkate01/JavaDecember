package Array;//Write a Java program to find the maximum and minimum value of an array.

public class MinMax {
    static void main(String[] args) {
        int[] arr = {2,5,6,8,9,3,6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(" "+max);
        System.out.println(" "+min);

    }
}
