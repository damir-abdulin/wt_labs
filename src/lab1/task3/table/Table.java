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
package lab1.task3.table;

public class Table {

    private final int lineLength = 23;
    private StringBuilder stringTable;

    /**
     * Show string `tableString`.
     */
    public void printTable()
    {
        System.out.println(stringTable);
    }

    /**
     * Add table header to `tableString`.
     */
    public void addHeader() {
        stringTable.append(" x         | tg(x)     |%n");
        addLine(lineLength);
    }

    /**
     * Add function result to `tableString`.
     * @param x - argument
     * @param f - function value
     */
    public void printRow(double x, double f) {
        stringTable.append(String.format(" %-10.2f| %-10.2f|%n", x, f));
    }

    /**
     * Output line to screen.
     * @param length - line length
     */
    public void addLine(int length) {
        stringTable.append("-".repeat(Math.max(0, length)));
        stringTable.append("|");
    }
}
