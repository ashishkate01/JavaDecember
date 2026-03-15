package String;

public class MinCharOccurrence {

    static void main(String[] args) {
        String s1 = "aabbbcccc";
        //s1 = s1.replaceAll("\\s",""); // for remove space
        int[] arr = new int[127];

        for (int i = 0; i < s1.length(); i++)
        {
            arr[s1.charAt(i)] =  arr[s1.charAt(i)]+1;
        }
        int min = Integer.MAX_VALUE;//We are finding MINIMUM value Initial value must be LARGEST possible So that first comparison always succeeds And real minimum can be found correctly
        char c = ' ';

        for (int i = 0; i < s1.length(); i++) {
            if( arr[s1.charAt(i)] < min ){
                min = arr[s1.charAt(i)];
                c = s1.charAt(i);
            }



        }

        System.out.print("Minimum Repeated character is : "+c);


    }

}





