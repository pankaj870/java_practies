package JavaScript.Question31;

import java.util.ArrayList;
import java.util.List;

public class CatSenDog {
    
    public List<String> partitionSubstrings(String input) {
        List<String> list= new ArrayList<>();
       for(int i=0;i<input.length()-2;i++){
list.add(input.substring(i, i+3));
        
       }
        return list;
    }

    public static void main(String[] args) {
    CatSenDog partitioner = new CatSenDog();
        String input = "catsendog";
        List<String> result = partitioner.partitionSubstrings(input);
        for (String partition : result) {
            System.out.println(partition);
        }
}
}
