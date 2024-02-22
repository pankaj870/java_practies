package Recursion;

public class Table{
public static void cal(int num){
    if(num==11){
        return ;
    }
    System.out.println(num*2);
    cal(num+1);
}
    public static void main(String args[]){
        int num=1;
        cal(num);
    }
}