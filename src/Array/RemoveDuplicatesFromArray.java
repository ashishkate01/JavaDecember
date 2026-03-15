package Array;

public class RemoveDuplicatesFromArray {
    static void main(String[] args) {


        int[] arr = {1,3,5,7,9};
        int[] arr1 = {2,4,6,8,0,7};

        System.out.println("Duplicate Elements : ");

        int[] newarr = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == (arr1[j])) {
                    System.out.println(newarr[i] + " ");
                }
            }
        }


    }
}
