package JavaScript.Question31;

public class SotedWithFun {

    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};

      for(int j=0 ; j<arr.length-1;j++){
        for(int i = 0; i<arr.length-i-1;i++){
            int tem = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tem;
        }
    }

    for(int el : arr){
        System.out.println(el);
    }
}
}
