package OOPS;

class Apple{
     Apple(){
         System.out.println("I am Constructor");
     }
}

class Orange{
    Orange(){
        System.out.println("I am Constructor No 2");
    }
}



public class ConstructorOverloading {
    static void main(String[] args) {
        Apple obj = new Apple();
        Orange obj1 = new Orange();
    }
}
