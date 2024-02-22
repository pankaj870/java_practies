package Basic;
import java.util.*;
/**
 * LinerSearch
 */
 class LinerSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr={};
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the finding element :");
        int element =sc.nextInt();
        lable :
        for(int j=0;j<size;j++){
            if(arr[j]==element){
                System.out.println("position :" + j);
                break lable;
            }else{
                System.out.println("element does not exits :"+ element);
            }
        }
        sc.close();
    }
}