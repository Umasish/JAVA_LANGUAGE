import java.util.HashMap;

public class HasMap1 {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        //PUT O(1)
        hm.put("chottu" , 23);
        hm.put("mantu" , 22);
        hm.put("mampi" , 21);
        hm.put("putul" , 21);

        System.out.println(hm);

        //GET o(1)
        System.out.println(hm.get("umasish"));

        //ContainsKey  O(1)
        System.out.println(hm.containsKey("umasish"));

        //Remove O(1)
        System.out.println(hm.remove("putul"));
        System.out.println(hm);
                                                            
    }  
}
