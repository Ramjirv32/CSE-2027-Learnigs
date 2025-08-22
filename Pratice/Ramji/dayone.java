    import java.util.*;

public class dayone {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n ;i++){
            arr[i] = in.nextInt();
        }
     
       int i =1;
       while(i<n){
            if(arr[i-1]<arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            i+=2;
       }
       System.out.println("correct: Array" + Arrays.toString(arr));
    }
}


