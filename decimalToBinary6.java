class dtb{
    void decToBin(int num){
        int mynum = num;
        int pow = 0;
        int bin = 0;
        int rem;
        while(num>0){
            rem = num % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        
        }
        System.out.println("binary of "  + mynum + " = " + bin );
    }

}

public class decimalToBinary6 {
    public static void main(String[] args) {
        dtb d = new dtb();
        d.decToBin(8);
    }
}
