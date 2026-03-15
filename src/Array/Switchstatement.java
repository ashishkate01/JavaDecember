package Array;

import java.util.Scanner;

public class Switchstatement {
    static void main(String[] args) {

        //int dayofweek = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        switch(number){
            case 1 :
                System.out.println("sunday");
                break;
            case 2 :
                System.out.println("monday");
                break;
            case 3 :
                System.out.println("tuesday");
                break;
            case 4 :
                System.out.println("wednesday");
                break;
            case 5 :
                System.out.println("thusday");
                break;
            case 6 :
                System.out.println("friday");
            break;
            case 7 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("please enter valid number");
        }
    }
}
