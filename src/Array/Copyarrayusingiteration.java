package Array;

public class Copyarrayusingiteration {
    static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};

        int[] result = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++ ){
            result[i] = arr[i];

        }
        System.out.println("copied elements");
        for (int i = 0 ; i < result.length ; i++ ){
            System.out.print(" "+result[i]);
        }
    }
}
