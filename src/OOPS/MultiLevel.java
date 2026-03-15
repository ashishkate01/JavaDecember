package OOPS;

import java.awt.*;
import java.util.logging.Level;

public class MultiLevel {

     void A(){
         System.out.println("Class A");
     }

     static void main(String[] args) {

         Level2 obj = new Level2();
         obj.A();
         obj.L1();
         obj.L2();
     }
}

 class Level1 extends MultiLevel {
     void L1() {
         System.out.println("Class L1");
     }
 }

  class Level2 extends Level1 {
      void L2() {
          System.out.println("Class L2");
      }
  }

