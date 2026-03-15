package Array;

public class newCheckValue {
    static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        boolean value = false;
        int num = 14;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == num ){
                value=true;
                break;


            }
        }
        if (value){
            System.out.println("value found");
        }else {
            System.out.println("value not found");
        }
    }
}
