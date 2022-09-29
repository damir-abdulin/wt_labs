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
package lab1.input;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    /**
     * Init object for get input from System.in
     */
    public Input()
    {
        scanner = new Scanner(System.in);
    }

    /**
     * Init object for get input from stream
     * @param stream source for inputs
     */
    public Input(java.io.InputStream stream)
    {
        scanner = new Scanner(stream);
    }

    /**
     * Returns double value from scanner.
     * @param message input prompt.
     * @return double value
     */
    public double getDoubleValue(String message) {
        System.out.print(message);

        while (!scanner.hasNextDouble()) {
            scanner.next();

            System.out.println("[ERROR: Invalid input] Input real number.");
            System.out.print(message);
        }

        return scanner.nextDouble();
    }

    /**
     * Returns integer value from scanner.
     * @param message input prompt.
     * @return double value
     */
    public int getIntegerValue(String message) {
        System.out.print(message);

        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("[ERROR: Invalid input] Input integer number.");
            System.out.print(message);
        }

        return scanner.nextInt();
    }

    /**
     * Get values for array from scanner.
     * @param arr destination
     * @param arrName array name for input prompt
     */
    public void getIntegerArray(int[] arr, String arrName) {
        String inputPrompt;

        for (int i = 0; i < arr.length; i++) {
            inputPrompt = String.format("Input %s[%d]: ", arrName, i);
            arr[i] = getIntegerValue(inputPrompt);
        }
    }

    /**
     * Get values for array from scanner.
     * @param arr destination
     * @param arrName array name for input prompt
     */
    public void getDoubleArray(double[] arr, String arrName) {
        String inputPrompt;
        for (int i = 0; i < arr.length; i++) {
            inputPrompt = String.format("Input %s[%d]: ", arrName, i);
            arr[i] = getDoubleValue(inputPrompt);
        }
    }
}
