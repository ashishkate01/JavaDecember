package Array;//Write a Java program to remove a specific element from an array.

public class RemoveElement {
    static void main(String[] args) {
        int[] arr = {3,5,8,7,9,4};

        int removelement = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter element to remove from array");
//        int removelement = sc.nextInt();

        int[] result = new int[arr.length-1];
        int j = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] != removelement){
                result[j] = arr[i];
                j++;
            }

        }
/*
        for(int i = 0 ; i< result.length ; i++ ){
            System.out.println(result[i]);
        }*/

        for(int a : result){
            System.out.print(" "+a);
        }
    }

}