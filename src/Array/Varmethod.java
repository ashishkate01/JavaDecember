package Array;

public class Varmethod {
    int age = 23;
    double budget = 20000.0;
    boolean isplace = true;
    String name = "Ashish";


    void method(){
        System.out.println("void return type with no params");
    }

   void agemethod(){
        System.out.println("number of age with no params");

    }

    void showbudget(){
        System.out.println("current budget : Rs " + budget );
    }

    void add (int a,int b){

        int c=a+b;
       System.out.println("addition of two numbers :"+(a+b));

    }

    public static void main(String[] args){
        System.out.println("Ashish");
        Varmethod varmethod1 = new Varmethod();
        varmethod1.method();
        varmethod1.showbudget();
        varmethod1.agemethod();
        //System.out.println("Addition is " + );
        varmethod1.add(10,20);




    }
}
