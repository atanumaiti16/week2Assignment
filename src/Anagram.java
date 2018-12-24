import java.util.Arrays;

public class Anagram {

    static  boolean anagram(String A, String B){

        char[] c1= A.toCharArray();
        char[] c2 = B.toCharArray();

        if(c1.length != c2.length){
            return false;
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i =0 ; i <c1.length; i++){
            if (c1[i] != c2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[]  args){
        boolean ab = anagram("ABCD", "BADC");

        System.out.println(ab);
    }
}
