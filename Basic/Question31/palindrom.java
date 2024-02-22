package JavaScript.Question31;

public class palindrom {
    public static void main(String[] args) {
        int p=1000000001,x=p;
        int y=0;

        while(x!=0){
            y=y+(x%10);
            y*=10;
            x/=10;
        }
 y/=10;
        if(p==y){
            System.out.println("its"+y);
        }else{
            System.out.println("not"+y);
        }
        
        
    }
}
