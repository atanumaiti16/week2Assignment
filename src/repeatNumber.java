import java.util.ArrayList;
import java.util.Hashtable;

public class repeatNumber {
    static ArrayList<Integer> repeat(int[]  arr){

        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

        for(int i = 0 ; i < arr.length; i++){
            if(hashtable.containsKey(arr[i])){
                hashtable.put(arr[i],hashtable.get(arr[i])+1);
                //hashtable.replace(arr[i],hashtable.get(arr[i])+1);
            }
            else{
                hashtable.put(arr[i], 1);
            }
        }

        ArrayList<Integer> opt = new ArrayList<Integer>();

        for(int i : hashtable.keySet()){
            if(hashtable.get(i) == 2){
                opt.add(i);
            }
        }

        //System.out.println(hashtable);

        return opt;
    }

    public  static  void main(String[] args){
        int[] Arr = {1,1,3,3,3,4,4,4,3,6,6};

        ArrayList<Integer> X = repeat(Arr);

        System.out.println(X);
    }
}
