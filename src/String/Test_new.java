package String;

public class Test_new {
        public static void main(String[] args) {
            String s1 = new String("HelloJava");
            String s2 = new String("HelloJava");

            System.out.println("Program running...");
            try {
                Thread.sleep(300000); // keep program alive
            } catch (Exception e) {}
        }
    }

