public class Recursion8FriendsParing {
    static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice 

        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWay = (n-1) * fnm2;

        return fnm1+pairWay;

    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
