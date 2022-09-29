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
package lab1.task2.main;

import lab1.input.Input;
import lab1.task2.filledArea.FilledArea;

public class Task2 {
    public static void main(String[] args) {

        Input input = new Input();

        double x = input.getDoubleValue("Input x: ");
        double y = input.getDoubleValue("Input y: ");

        FilledArea topArea = new FilledArea(-4, 5, 4, 0);
        FilledArea lineArea = new FilledArea(-6, 0, 6, 0);
        FilledArea bottomArea = new FilledArea(-6, 0, 6, -3);

        boolean isInArea = isInComplexArea(x, y, topArea, lineArea, bottomArea);

        System.out.println(isInArea);
    }

    /**
     * Returns true if complex area from task 2 has point (x, y).
     * @param top - top rectangle area.
     * @param line - line between areas.
     * @param bottom - bottom rectangle area.
     */
    private static boolean isInComplexArea(double x, double y, FilledArea top, FilledArea line, FilledArea bottom) {
        return top.isInArea(x, y) || (!line.isInArea(x, y) && bottom.isInArea(x, y));
    }
}
