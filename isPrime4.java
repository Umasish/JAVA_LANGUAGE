class prime{
    public boolean primeOrNot(int n){
        if(n==2){
            return true;
            
        };
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            };
            
        }
        return true;
    };
    public void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(primeOrNot(i)){
                System.out.println(i +" ");
            }
        }
        System.out.println();
    }
    
};
class isPrime4{
    public static void main(String[] args) {
        //boolean res = prime.primeOrNot(8);
        prime p = new prime();
        p.primeInRange(25);
    }
}