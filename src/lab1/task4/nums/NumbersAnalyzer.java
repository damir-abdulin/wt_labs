/*
 * The MIT License
 * Copyright © 2022 Damir Abdulin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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

    /**
     * Returns indices primary elements.
     * @return indices array.
     */
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
