package Array;//Write a Java program to find common elements between two arrays (string values).

public class FindTwostrings {
    static void main(String[] args) {
        String[] arr = {"Ashish", "rushi", "umesh", "yash", "Shreyash"};
        String[] newarr = {"Akash", "rushi", "Ramesh", "yash"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                if(arr[i].equals(newarr[j]))
                {
                    System.out.print(arr[i]+" ");
                    break;

                }
            }
        }
    }}