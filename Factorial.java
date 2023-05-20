import java.math.BigInteger;

public class Factorial {
    BigInteger bg;
    Factorial(int n){
        this.bg=FactorialN(n);
        System.out.println("Факториал "+n+"! = " + bg.toString());
    }
    BigInteger FactorialN(int n){
        if (n == 1) {
            return BigInteger.valueOf(1);
        } else {
            return FactorialN(n-1).multiply(BigInteger.valueOf(n));
        }
    }

}
