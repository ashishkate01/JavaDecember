class parent{
    public parent(){
        System.out.println("No-arg constructor of parent");
    }
    public parent(int a , String s){
        System.out.println("2-arg constructor of parent");
    }
}
public class constructorchainingintro extends parent{
    public constructorchainingintro(){
        System.out.println("No-arg constructor of child");
    }
    public constructorchainingintro(int a , String s){
        System.out.println("2-arg constructor of child");
    }
}

void main(String[] args) {

    constructorchainingintro cc = new constructorchainingintro();
}




