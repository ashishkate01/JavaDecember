package Array;

public class IntroToconstructor {

    String name;
    int roll_no;

    public IntroToconstructor(String s,int m){
        name = s;
        roll_no=m;
//        System.out.println(s);
//        System.out.println(m);
    }

    static void main(String[] args) {
        IntroToconstructor obj = new IntroToconstructor("Ashish",101) ;
        System.out.println("Name : "+obj.name+" "+"  ::  "+" Roll no : "+obj.roll_no);
        IntroToconstructor obj1 = new IntroToconstructor("umesh",102) ;
        System.out.println("Name : "+obj1.name+" "+"   ::  "+" Roll no : "+obj1.roll_no);



    }

}
