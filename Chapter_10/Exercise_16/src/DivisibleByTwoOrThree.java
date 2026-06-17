import java.math.BigInteger;

public class DivisibleByTwoOrThree {
    public static void main(String[] args) {
        String value = "1";
        for (int i = 1; i < 50; i++) {
            value = value + "0";
        }
        BigInteger num = new BigInteger(value);
        int count = 0;
        while (count < 10) {
            if (num.remainder(BigInteger.TWO).equals(BigInteger.ZERO) || num.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println("num = " + num);
                count = count + 1;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
