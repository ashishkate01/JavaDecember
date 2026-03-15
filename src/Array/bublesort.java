package Array;

//public class bublesort {
//    static void main(String[] args) {
//        int[] arr = {4,3,5,7,8,9,6,2,1};
//                   //0,1,2,3,4,5,6,7,8
//        int temp = 0;
//
//        for(int i = 0; i <= arr.length -1 ; i++)
//        {
//            for(int j = i+1 ; j <= arr.length-i-1;j++){
//            if (arr[j] > arr[j+1]) {
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1]= temp;
//
//            }}
//
//        }
//        for(int i = 0;i<= arr.length;i++){
//            System.out.println("sorted elements"+arr[i]);
//
//    }}
//}
public class bublesort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0 ; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
