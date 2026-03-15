package OOPS;



class V1{
    int speed;
    String Brand;

    void a(int x,String t){
       speed = x;
       Brand  = t;

    }
    void b(){
        System.out.println("Brand : "+Brand);
        System.out.println("Speed : "+speed);
    }
}

public class IntroToEncapsulation {
    static void main(String[] args) {

        V1 obj = new V1();
        obj.a(100,"Tata");
        obj.b();

    }
}
