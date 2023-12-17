import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger bigNumber1 = calculateFactorial(balls);
        BigInteger bigNumber2 = calculateFactorial(share);
        BigInteger bigNumber3 = calculateFactorial(balls - share);

        BigInteger result = bigNumber1.divide(bigNumber2.multiply(bigNumber3));
        return result.intValue();
    }

    public BigInteger calculateFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}