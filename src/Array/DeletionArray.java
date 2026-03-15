package Array;

public class DeletionArray {
    static void main(String[] args) {
        int[] arr = {10,20,25,30,40,50};

        int index = 2;
        int j = 0;

        int[] newarr = new int[arr.length-1];

        for (int i = 0; i < arr.length; i++) {

            if (i==index)
            {
                continue;
            }
            newarr[j]=arr[i];
            j++;

        }
         for (int no :newarr) {
             System.out.print(no + " ");

         }


    }


}
