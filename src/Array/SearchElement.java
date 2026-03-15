package Array;

public class SearchElement {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int element = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
                  if(arr[i]==element){
                      System.out.println(" Element found at "+i+" index position and Element is "+arr[i]);
                      found =true;
                  }
        }
        if (!found)
        {
            System.out.println(" Element not found ");
        }

        }
    }

