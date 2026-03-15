package Array;

public class Findduplicate {
    static void main(String[] args) {
        int[] arr = {2,3,3,4,6,7,7,5};

        System.out.println("Duplicate elements");

        for(int i = 0 ; i <= arr.length; i++){
            for (int j = i+1; j < arr.length ; j++){
               if( arr[i] == arr[j])
                System.out.print(arr[i]+" ");
                break;
            }
        }

    }
}
