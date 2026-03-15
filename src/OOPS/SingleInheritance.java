package OOPS;

public class SingleInheritance
    {

        void Z(){
            System.out.println("class z");
        }
    }
    class Student extends SingleInheritance
    {
        void Z1()
        {
            System.out.println("class z1");
        }

        public static void main(String[] args) {

            Student obj = new Student();
            obj.Z1();
            obj.Z();

        }
    }



