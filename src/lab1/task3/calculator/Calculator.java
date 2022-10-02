package lab1.task3.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private final double startNumber;
    private final double endNumber;
    private final double step;

    /**
     * Init class for calculating tan(x) where x = [a, b].
     * @param startNumber first value for x
     * @param endNumber last value for x
     * @param step step for x
     */
    public Calculator(double startNumber, double endNumber, double step) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.step = step;
    }

    /**
     * Calculating tan(x) where x = [a, b].
     * @return calculating result.
     */
    public Map<Double, Double> getResultMap() {
        Map<Double, Double> result = new HashMap<Double, Double>();

        double tg;
        for (double x = startNumber; x < endNumber; x += step) {
            tg = Math.tan(x);
            result.put(x, tg);
        }

        tg = Math.tan(endNumber);
        result.put(endNumber, tg);

        return result;
    }
}
