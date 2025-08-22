import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n ;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("OLD ARRAY:" + Arrays.toString(arr));
        for(int i = 0; i<n-1; i+=2){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Result ARRAY:" + Arrays.toString(arr));
    }
}
