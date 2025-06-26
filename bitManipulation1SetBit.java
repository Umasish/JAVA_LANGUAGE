public class bitManipulation1SetBit {
    public static void main(String[] args) {
        int n=15; //set bits of 15 =4
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }
}
