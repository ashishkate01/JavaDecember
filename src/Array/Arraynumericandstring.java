package Array;

public class Arraynumericandstring {
    public static void main(String[] args) {
        int[] arr = {4,7,8,5,2,4,9,1};
        String[] name = {"Ashish","umesh","yash","rao"};

        // Sort
       for(int i = 0;i< arr.length-1;i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] =arr[j];
                   arr[j] =temp;

               }
           }
       }
        System.out.println("sorted numbers");
        for(int i = 0;i < arr.length;i++) {
            System.out.print( " " + arr[i]);
        }

        System.out.println("\n====================");

        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;

                }
            }
        }
        System.out.println(" sorted strings ");
        for(int i = 0;i < name.length;i++) {
            System.out.println( " " + name[i]);
        }
    }
}
