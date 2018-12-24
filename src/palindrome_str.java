public class palindrome_str {

    static  void func(String S){
        char[] C = S.toCharArray();

        String rev = new String();

        for (int i = C.length-1; i >=0 ;i--){
            rev = rev + C[i];
        }

        if(rev == S){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    public  static  void main(String[] args){

        String S = "hgfghj";

        func(S);
    }
}
