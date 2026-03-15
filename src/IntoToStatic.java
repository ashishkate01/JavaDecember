public class IntoToStatic {
    int a = 10;
    static int b = 20;

    static void A1(){
        int a = 10;
         int b = 30;
    }
    static void main(String[] args) {

          b = 40;
        IntoToStatic obj  =new IntoToStatic();
        obj.a = 60;

    }
}
