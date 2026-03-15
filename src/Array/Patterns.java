package Array;

public class Patterns {
    static void main(String[] args) {


// Star pattern

//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//output
//        *
//        **
//        ***
//        ****

//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

//        ****
//        ***
//        **
//        *


//        for(int i = 1; i<=4 ;i++)
//        {
//            for (int j = 3; j >= i; j--)
//            {
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=i; k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        output
//                   *
//                  **
//                 ***
//                ****

//        for (int i = 1; i <= 5; i++)
//        {
//            for (int j = 5; j > i; j--)
//            {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i ; k++)
//            {
//                System.out.print("* "); // key highlight
//            }
//            System.out.println();
//
//        }


//        output


//            *
//           * *
//          * * *
//         * * * *
//        * * * * *


//        for (int i = 1; i <= 4; i++)
//        {
//            for (int j = 2; j <= i ; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k = 4; k >= i; k--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        output
//        ****
//         ***
//          **
//           *


//        for(int i = 1 ; i<=4; i++)
//        {
//            for(int j = 1 ; j<=4 ;j++ )
//            {
//                if(i >=2 && j>=2 && i<=3 && j<=3)
//                {
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//        }

        // output

        //****
        //*  *
        //*  *
        //****


//        for(int i = 1 ; i<=5; i++)
//        {
//            for(int j = 1 ; j<=5 ;j++ )
//            {
//                if(i==j || i+j==5+1)//most important i==j --> main diagonal i+j==n+1 --> reverse diagonal(follows matrix)
//
//                {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }


//        output
//        *   *
//         * *
//          *
//         * *
//        *   *

        for (int i = 1; i < 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            for (int l = 2; l <=i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
