package Array;

public class Intro_to_this {


    public Intro_to_this() {
        System.out.println("no arg");
    }

    public Intro_to_this(int a, String s) {
        this();
        System.out.println("2 arg");

    }

    public Intro_to_this(int a, String s,boolean ab) {
        this(100,"Ashish");
        System.out.println("3 arg");
    }

    static void main(String[] args) {
        Intro_to_this obj = new Intro_to_this(10,"java",false);
    }
}
