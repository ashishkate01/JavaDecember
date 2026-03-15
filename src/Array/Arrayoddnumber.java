package Array;

public class Arrayoddnumber {
    static void main(String[] args) {
        int[] arr = {27,40,75,90,86,94};
        System.out.println("Even numbers : ");
        for(int i = 0 ; i<=5; i++){
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
