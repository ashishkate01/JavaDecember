package OOPS;

class XZ{
    void N() {
              System.out.println("N");
             }
}
class YZ extends XZ{
    @Override
    void N() {
              System.out.println("M");
             }
}



public class PolymorphismRunTimePractice {
    static void main(String[] args) {
        XZ obj = new YZ();
        obj.N();
    }
}
