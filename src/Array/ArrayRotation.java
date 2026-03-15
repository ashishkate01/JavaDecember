package Array;//Take one array and rotate it in clock wise direction

public class ArrayRotation {
     static   void main(String[] args){
         int[] arr = {9,3,4,5,4,7};
         int first = 0;
        int last = arr.length-2;
         for (int i = 0; i < arr.length; i++) {
             if (last != arr.length) {

                 int temp = arr[first];
                 arr[first] =arr[last];
                 arr[last]=temp;
                 first++;
                 last++;
             }

         }
         for (int i = 0; i < arr.length; i++) {
             System.out.print(" "+arr[i]);
         }
     }

}
