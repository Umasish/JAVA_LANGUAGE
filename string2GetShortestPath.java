public class string2GetShortestPath {
    static float shortestPath(String path){
        int x=0;int y= 0;
        for(int i=0;i<path.length();i++){
            int dir = path.charAt(i);

            //East 
            if(dir == 'E'){
                x++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //South
            else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        String path = "NS";
        System.out.println(shortestPath(path));
    }
}
