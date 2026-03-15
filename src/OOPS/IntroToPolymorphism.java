package OOPS;

// compile time polymorphism(Ststic binding or Early binding) // Method overloading


class One{
    int A1(int a, String Str1){

        System.out.println(a+" - "+Str1);
        return a;

    }

    void A1(){
        System.out.println("Ashish");

    }
}

public class IntroToPolymorphism {
    static void main(String[] args) {

         One obj = new One();
        obj.A1(10,"Umesh");
        obj.A1();


    }

}
