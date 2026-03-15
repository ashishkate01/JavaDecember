package Array;//print  highest sum pair

public class HighestPairSum {
     static void main(String[] args) {
        //highest sum pair
        int arr[] = {19,64,24,56,45,90};
        int n = arr.length;
        int Finalsum = 0;
        int ele1 = -1;
        int ele2 = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = arr[i]+arr[j];
                if(sum>Finalsum){
                    Finalsum = sum;
                    ele1 = arr[i];
                    ele2 = arr[j];
                }
            }
        }
        System.out.println("Sum is "+Finalsum);
         System.out.println("elements are "+ele1+" and "+ele2);
    }
}
