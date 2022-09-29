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
package lab1.task1.equation;

public class Equation {

    private double x, y;

    /**
     * Init equation with zero params.
     */
    public Equation()
    {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Init equation with define params.
     * @param x value for x.
     * @param y value for y.
     */
    public Equation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Set field this.x;
     * @param value new value.
     */
    public void setX(double value)
    {
        this.x = value;
    }

    /**
     * Set field this.y;
     * @param value new value.
     */
    public void setY(double value)
    {
        this.y = value;
    }

    /**
     * Solve equation.
     * @return result equation solving.
     */
    public double Solve() {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);

        double absFromDenominator = Math.abs(x - (2 * x)/(1 + x * x * y * y));
        double denominator = 2 + absFromDenominator;

        return numerator / denominator + x;
    }
}
