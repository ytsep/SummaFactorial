import java.math.BigInteger;

public class SumFactorial {
    public static void main(String[] args) {
        int summa;
        long time, t1;
        time = System.currentTimeMillis();
        summa = SummaFactorial(new Factorial(150).bg);//new BigInteger("2599999999")
        wait(0);
        t1=System.currentTimeMillis() - time;
        System.out.println("Затраченное время = "+ t1 +" mc");
        System.out.println("Сумма цифр = "+summa);
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    static int SummaFactorial(BigInteger n){
        long count=1;
       int summa = 0;
       while (n.compareTo(BigInteger.valueOf(10))>0){
           summa+=(n.mod(BigInteger.valueOf(10))).intValue();
           n = n.divide(BigInteger.valueOf(10));
           count++;
       }
        System.out.println("Количство знаков = "+count);
        return summa + n.intValue();
    }
}
