public class multiplication {

    static  int multi(int I, int A){
        int temp = I;
        int sum =0;

        for(int i=0; i<A ; i++){
            sum = sum+ I;
        }

        return sum;
    }

    public  static void main(String[] args){
        int I = 10;
        int B = 20;

        System.out.println(multi(10,20));
    }
}
