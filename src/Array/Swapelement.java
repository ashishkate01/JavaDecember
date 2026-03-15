package Array;

public class Swapelement {
    static void main() {
        int a = 10 ;
        int b = 20 ;

        System.out.println("print before swap "+a);
        System.out.println("print before swap "+b);


//        int temp = b; // temp = 20
//        b = a ; // b = 10
//        a = temp;
//
//        int temp = a; // temp = 20
//        a=b ; // b = 10
//        b = temp;

        // without using third variable

         a = a+b;
         b= a-b;
         a= a-b;

        System.out.println("print after swap "+a);
        System.out.println("print after swap "+b);

    }
}
