package lab1.task5.main;

import lab1.input.Input;
import lab1.task4.nums.NumbersAnalyzer;

public class Task5 {
    public static void main(String[] args) {

        Input input = new Input();
        int n = input.getIntegerValue("Input N: ");

        int[] arr = new int[n];
        input.getIntegerArray(arr, "arr");

        NumbersAnalyzer analyzer = new NumbersAnalyzer(arr);
        System.out.printf("Result: %d\n", analyzer.countExtraNumbers());
    }
}
