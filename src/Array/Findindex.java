package Array;// Write a Java program to find the index of an array element.

import java.util.Scanner;

public class Findindex {
    static void main(String[] args) {
        int[] arr = {8,6,4,2,7,9};

        //int searchvalue = 4;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter value to search : ");
        int searchvalue = sc.nextInt();
        int index = -1;

        for(int i = 0;i < arr.length ; i++){
            if (arr[i] == searchvalue)
                index = i ;


        }
        if (index != -1){
            System.out.println("element found at index :  "+index);
        }
        else {
            System.out.println("element not found"+index);
        }
    }
}
