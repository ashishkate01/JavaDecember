package String;

public class MaxCharOccurrence {

    static void main(String[] args) {
        String s1 = "supercalifragilisticexpialidocious                                                                      ";
//        s1 = s1.replaceAll("\\s",""); // for remove space
        int[] arr = new int[127];
        int max = -1;
        char c = ' ';

        for (int i = 0; i < s1.length(); i++)
        {
            arr[s1.charAt(i)] =  arr[s1.charAt(i)]+1;
        }


        for (int i = 0; i < s1.length(); i++) {
            if(max < arr[s1.charAt(i)]){
                max = arr[s1.charAt(i)];
                c = s1.charAt(i);
            }

        }

        System.out.print("Maximum Repeated character is : "+c);


    }

}
