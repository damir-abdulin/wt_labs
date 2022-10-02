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
package lab1.task9.main;

import lab1.task9.objects.*;

public class Task9 {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.putBall(new Ball(10.3, Color.BLACK));
        basket.putBall(new Ball(1.3,  Color.GREEN));
        basket.putBall(new Ball(6.3,  Color.BLUE));
        basket.putBall(new Ball(7.8,  Color.BLUE));
        basket.putBall(new Ball(3.6,  Color.BLUE));
        basket.putBall(new Ball(5.12, Color.RED));
        basket.putBall(new Ball(1.6,  Color.GREEN));

        System.out.println("Weight: " + basket.getWeight());
        System.out.println("Blue balls: " + basket.countColor(Color.BLUE));
    }
}
