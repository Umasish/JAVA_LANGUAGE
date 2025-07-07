import java.util.*;
public class ArrayList3ContainerWater {

    //Brute force approach . time complexity = O(n^2)

    // static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i = 0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int heigh = Math.min(height.get(i),height.get(j));
    //             int width = j - i ;
    //             int water = heigh * width;
    //             maxWater  = Math.max(water,maxWater);
    //         }
    //     }
    //     return maxWater;
        
    // }

    //OPTIMIZE APPROACH . TC = O(n)

    static int storeWater(ArrayList<Integer> height){

        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int wd = rp - lp;
            int water = ht*wd;
            maxWater=Math.max(water,maxWater);
            //update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
