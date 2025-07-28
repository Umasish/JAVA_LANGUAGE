import java.util.*;
public class Greedy7ChocolaProblem {
    public static void main(String[] args) {
        // Integer verCost[] = {2,1,3,1,4};
        // Integer horCost[] = {4,1,2};
        Integer horCost[] = {3,5};
        Integer verCost[] = {2,4};
        Arrays.sort(verCost,Collections.reverseOrder());
        Arrays.sort(horCost,Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1 , vp =1;
        int cost = 0;

        while(h<horCost.length && v<verCost.length){
            if(horCost[h]<=verCost[v]){ //vertical cut
                cost+= hp * verCost[v];
                vp++;
                v++;
            }
            else{
                cost+= vp * horCost[h];
                hp++;
                h++;
            }
            
        }
        while(h<horCost.length){
                cost+= vp * horCost[h];
                hp++;
                h++;
        }
        while(v<verCost.length){
            cost+= hp* verCost[v];
            vp++;
            v++;
        }
        System.out.println("Total cost is "+ cost);
    }
    
}
