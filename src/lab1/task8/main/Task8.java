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
