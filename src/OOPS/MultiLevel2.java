package OOPS;

import java.awt.*;
import java.util.logging.Level;

public class MultiLevel2 {

    void A(){
        System.out.println("Class C");
    }

    static void main(String[] args) {

        Level22 obj = new Level22();
        obj.A();
        obj.L1();
        obj.L2();
    }
}

class Level11 extends MultiLevel2 {
    void L1() {
        System.out.println("Class x1");
    }
}

class Level22 extends Level11 {
    void L2() {
        System.out.println("Class X2");
    }
}


