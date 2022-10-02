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
package lab1.task3.main;

import lab1.input.Input;
import lab1.task3.calculator.Calculator;
import lab1.task3.table.Table;
import java.util.Map;


public class Task3 {

    private static final double ACCURACY = 0.001;

    private static Table table;

    public static void main(String[] args) {

        Input input = new Input();
        table = new Table();

        double a = input.getDoubleValue("Input a: ");
        double b = input.getDoubleValue("Input b: ");
        double h = input.getDoubleValue("Input h: ");

        createTable(a, b, h);
        table.printTable();
    }

    /**
     * Create table for results tan(x)
     * @param a - min value
     * @param b - max value
     * @param h - step
     */
    private static void createTable(double a, double b, double h) {
        Calculator calculator = new Calculator(a, b, h);
        Map<Double, Double> functionValues = calculator.getResultMap();

        table.addHeader();

        for (Map.Entry<Double, Double> entry : functionValues.entrySet()) {
            table.printRow(entry.getKey(), entry.getValue());
        }
    }

}
