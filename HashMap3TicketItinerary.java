import java.util.HashMap;

public class HashMap3TicketItinerary {
    public static String getStart(HashMap<String ,String> hm ){
        HashMap<String ,String> reverse = new HashMap<>();
        for(String key : hm.keySet()){
            reverse.put(hm.get(key) , key);
        }

        for(String key : hm.keySet()){
            if(!reverse.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String> hm = new HashMap<>();
        hm.put("MUC" ,"LHR");
        hm.put("JFK" ,"MUC");
        hm.put("SFO" ,"SJC");
        hm.put("LHR" ,"SFO");

        String start = getStart(hm);
        System.out.print(start);
        for(String key : hm.keySet()){
            System.out.print("->"+hm.get(start));
            start = hm.get(start);
        }

    }
}
