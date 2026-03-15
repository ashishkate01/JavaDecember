package Array;//Write a Java program to find duplicate values in an array of string values.

public class FindDuplicateString {
    static void main(String[] args) {
        String[] arr = {"Ashish","rushi","umesh","yash","rushi"};

        System.out.println("Duplicate String : ");

        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
