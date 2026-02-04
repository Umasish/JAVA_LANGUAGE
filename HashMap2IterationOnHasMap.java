import java.util.*;

public class HashMap2IterationOnHasMap {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        //PUT O(1)
        hm.put("chottu" , 23);
        hm.put("mantu" , 22);
        hm.put("mampi" , 21);
        hm.put("putul" , 21);

        //Set 
        //keySet / entrySet both work as same but for entryset we dont need to iterate entrySet simply return all the pair

        Set<String> keys = hm.keySet();

        for(String k : keys){
            System.out.println("key="+k +","+"value="+hm.get(k));
        }


                                                            
    } 
}
