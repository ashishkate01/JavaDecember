package Array;

public class Binarysearch {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int element = 70;
        int s = 0;
        int l = arr.length-1;

        int mid = (s+l)/2;

        if(arr[mid] == element)
        {
            System.out.println(" Element found at index : "+mid);
        }

        if(element > arr[mid])
        {
          s = mid+1;
           // System.out.println(" Element found at index : "+s);

        }
        else
        {
            l = mid-1;
           // System.out.println(" Element found at index : "+l);

        }

    }


}
