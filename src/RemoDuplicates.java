public class RemoDuplicates {

    static  String duplicate(String S){
        char[] C= S.toCharArray();

        String op = new String();

        int n = C.length;
        int i = 0;

        while (i <n){

            String temp = Character.toString(C[i]);

            if (op.contains(temp)) {
                i++;
            }
            else{
                op = op+ C[i];
            }


        }
        return  op;
    }

    public  static void  main(String[]  args){
        String S= "ghjkjhgfdfghjk";

        String op = duplicate(S);

        System.out.println(op);
    }
}
