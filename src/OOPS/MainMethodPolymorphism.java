package OOPS;

class P{
    void main(int a){
        System.out.println("first number : "+a);
    }

    void main(String Str1){

        System.out.println("Name : "+Str1);
    }
}

public class MainMethodPolymorphism {
    static void main(String[] args) {

        System.out.println("Hello");


        P obj = new P();
        obj.main(100);
        obj.main("Ram");
    }

}
