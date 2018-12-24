public class max_min {

    static  void  func(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i< arr.length;i++){
            if(arr[i]< min){
                min = arr [i];
            }
            if(arr[i]> max){
                max = arr[i];
            }

        }

        System.out.printf("max is %d min is %d",max, min);
    }

    public static  void main(String[] args){
        int[] arr = {3,4,5,1,0,100};

        func(arr);
    }
}
