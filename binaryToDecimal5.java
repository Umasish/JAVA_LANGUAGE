class btd{
    void bintDec(int bin){
        int mynum = bin;
        int pow = 0;
        int dec = 0;
        int lastDigit;
        while(bin>0){
            lastDigit = bin%10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("Decimal of "  + mynum + " = " + dec );
    }

}

public class binaryToDecimal5 {
    public static void main(String[] args) {
        btd b = new btd();
        b.bintDec(111);
    }
}
