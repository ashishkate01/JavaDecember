package Array;

public class Checkvalue {
    static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2};
        boolean found = false;
      int value = 9;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value : ");
//        int value  = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("value found");
        } else {
            System.out.println("value not found");

        }
    }
}
