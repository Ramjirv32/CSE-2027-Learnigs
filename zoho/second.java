
import java.util.*;
public class second {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }


        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> res = new HashMap<>();

        for(int i : array){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            res.put(entry.getValue(), res.getOrDefault(entry.getValue(), 0)+ entry.getKey()*entry.getValue());
        }

        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
