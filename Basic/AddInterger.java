package Basic;

public class AddInterger {
    public static void main(String[] args) {
        int I1[] ={2,4,3},I2[]={5,6,4};
int interger1=0,interger2=0;

        for(int i=I1.length-1;i>=0;i--){
            interger1=interger1*10+I1[i];
        }
        for(int i=I2.length-1;i>=0;i--){
            interger2=interger2*10+I2[i];
        }
        int sum=interger1+interger2;
        
        int out[] = new int[3];
        for(int i=0;i<3;i++){
            int tem =sum%10;
            out[i]=tem;
            sum/=10;
        }

        for(int i=out.length-1;i>=0;i--){
            System.out.print(" [ "+out[i]+" ] ");
        }
     }}
