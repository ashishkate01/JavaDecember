package Array;

public class ConstructorParent {

    public ConstructorParent(){
        System.out.println("No arg constructor parent");
    }
    public ConstructorParent(int a){
        System.out.println("arg constructor parent : ");
    }

}
class IntroToConstructorChain extends ConstructorParent{
    public IntroToConstructorChain(){
        System.out.println("No arg constructor Child");
    }
    public IntroToConstructorChain(int b){
        System.out.println("arg constructor Child");
    }

    static void main(String[] args) {
        IntroToConstructorChain child = new IntroToConstructorChain();

    }

}
