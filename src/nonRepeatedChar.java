import java.util.Hashtable;

public class nonRepeatedChar {

    static  void func(String S){

        char[] C = S.toCharArray();

        Hashtable <Character, Integer> hashtable= new Hashtable<Character, Integer>();

        for(int i = 0; i <C.length;i++){
            if(hashtable.containsKey(C[i])){
                hashtable.put(C[i], hashtable.get(C[i])+1);
            }
            else{
                hashtable.put(C[i], 1);
            }
        }

        for( char i: hashtable.keySet()){
            if(hashtable.get(i)==1){
                System.out.println(i);
                break;
            }
        }
    }

    public  static  void main(String[] args){
        String S = "AABBDDHHEEHHCCw";

        func(S);
    }
}
