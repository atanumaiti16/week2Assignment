public class ContainInteger {

    static  void func(String S){
        if(S.matches("[0-9]+")){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
    }
    public  static  void main(String[] args){
        func("1234gdgd");
    }

}
