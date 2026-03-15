class Parent{
    public Parent(){
        this(100,"ak" );
        System.out.println("no-arg constructor");
    }
    public Parent(int a ,String s){
        this(100,"ak" ,true);
        System.out.println("2-arg constructor");
    }
    public Parent(int a ,String s, boolean xy){
        System.out.println("3-arg constructor");
    }
}

public class Introtothis {
}

void main(String[] args) {
    Parent pp = new Parent();
}
