package JavaScript.Question31;

public class ThirdLargest {
    public static void main(String[] args) {
        int num[] = {8,9,7,5,4,2,3,6,1};

        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int tem =num[i];
                    num[i]=num[j];
                    num[j]=tem;
                }
            }
        }
        System.out.println(num[num.length-3]);
    }
}
