package lab1.task4.main;

import lab1.input.Input;

import java.util.Scanner;
import lab1.input.Input;
import lab1.task4.nums.NumbersAnalyzer;

public class Task4 {


    public static void main(String[] args) {

        Input input = new Input();
        int n = input.getIntegerValue("Input N: ");

        int[] arr = new int[n];
        input.getIntegerArray(arr, "arr");

        NumbersAnalyzer analyzer = new NumbersAnalyzer(arr);
        printPrimaryNumbers(analyzer);

    }

    private static void printPrimaryNumbers(NumbersAnalyzer analyzer)
    {
        int[] arr = analyzer.getNumbers();
        int[] primaryIndices = analyzer.getPrimaryNumbersIndices();

        if (primaryIndices.length > 0)
        {
            System.out.println("Primary numbers:");
            for(int index: primaryIndices)
            {
                System.out.printf("\tarr[%d] == %d\n", index, arr[index]);
            }
        } else {
            System.out.println("Array hasn't primary numbers.");
        }


    }
}
