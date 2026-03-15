//toString method Override

package Obj_Class_Methods;

class Test {
    int id = 10;
    public String toString() {
        String str =" Student id number is : "+ id;
        return str;
    }
}

public class Student {
    public static void main(String[] args) {
        Test s = new Test();
        System.out.println(s);
    }
}
