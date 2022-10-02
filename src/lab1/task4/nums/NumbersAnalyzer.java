package lab1.task4.nums;

import java.math.BigInteger;

public class NumbersAnalyzer {

    private final int[] numbers;

    public NumbersAnalyzer(int[] numbers)
    {
        this.numbers = numbers;
    }

    public int[] getNumbers()
    {
        return numbers;
    }
    public int[] getPrimaryNumbersIndices() {
        int countPrimaryNumbers = 0;

        int[] resultBuffer = new int[numbers.length];

        int number;
        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            BigInteger bigInteger = BigInteger.valueOf(number);

            if (bigInteger.isProbablePrime(5)) {
                resultBuffer[countPrimaryNumbers] = i;
                countPrimaryNumbers++;
            }
        }

        int[] result = new int[countPrimaryNumbers];
        System.arraycopy(resultBuffer, 0, result, 0, countPrimaryNumbers);
        return result;
    }
}
