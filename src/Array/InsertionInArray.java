package Array;

public class InsertionInArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;
        int element = 25;

        int[] newarr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }

            newarr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newarr[i+1]=arr[i];
        }

        for (int no : newarr) {
            System.out.print(no + " ");
        }
    }
}

