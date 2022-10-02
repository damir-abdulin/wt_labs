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
package lab1.task8.main;

import lab1.input.Input;
import lab1.task8.merger.Merger;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        Input input = new Input();

        int n = input.getIntegerValue("Input n: ");
        double[] arrA = new double[n];
        input.getDoubleArray(arrA, "a");

        int m = input.getIntegerValue("Input m: ");
        double[] arrB = new double[m];
        input.getDoubleArray(arrB, "b");

        Merger merger = new Merger();
        int[] indices = merger.getInsertionIndices(arrA, arrB);
        System.out.print(Arrays.toString(indices));
    }
}
