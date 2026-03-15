package Array;

public class Arrayoddaddition {
    static void main(String[] args) {
        int[] arr = {23,45,67,89,98,76};
        int sum = 0;

        for(int i = 0 ; i<=arr.length-1; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
                System.out.println("Addition of odd numbers is : " + sum);
            }
        }
            for(int i = 0 ; i<=arr.length-1; i++) {
                if (arr[i] % 2 == 0) {
                    sum = sum+arr[i];
                    System.out.println("addition of even numbers is : " + sum);
                }

            }


    }
}
