class binomial{
        public static int factorial(int n){
            int fact =1;
            for(int i =1; i<=n; i++){
                fact=fact*i;
            }
            return fact;
        };
         public static int binom(int n ,int r){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nr = factorial(n-r);

            int res= fact_n / (fact_r * fact_nr);
            return res;
        }
    
};
public class binomial3{
        public static void main(String args[]){
            int result = binomial.binom(5,2);
            System.out.println(result);
    }
}
