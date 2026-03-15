package Array;

public class IndexOddEvenSwap {
    static void main(String[] args) {
        int[] arr = {16,25,37,58,87,56};
        //index   // 0 1 2 3 4 5
        int temp = 0;
        for (int i = 0 ; i< arr.length-1 ; i+= 2){

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

        }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(" " + arr[i]);

                }
        }
    }

