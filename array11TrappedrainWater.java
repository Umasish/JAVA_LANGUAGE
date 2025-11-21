class arraytrappedRainWater{
    int trappedRainWater(int height[]){ 
        //leftmax boundary-array
        int leftMax[] = new int [height.length];
        leftMax[0]=height[0];
        for(int i =1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //Rightmax boundary-array
        int rightMax[]= new int [height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max( height[i],rightMax[i+1]);
        }
        //lopp
        int trappedwater =0;
        for(int i=0;i<height.length;i++){
            //waterlavel
            int waterlavel= Math.min(leftMax[i],rightMax[i]);
            //trappedwater
            trappedwater += (waterlavel-height[i])*1;  // here width = 1;

        }
        return trappedwater;
    }
    
}
public class array11TrappedrainWater {
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        arraytrappedRainWater a = new arraytrappedRainWater();
        int result =a.trappedRainWater(height);
        System.out.println(result);
    }
    
}
