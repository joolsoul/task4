package calcSequence;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        double x = readData("x");
        int n = (int) readData("n");

        double result = calcSequence(x,n);

        printResult(result);
    }

    static double readData(String variable)
    {
        System.out.printf("Input the %s = ",variable );
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    static double calcSequence(double x, int n)
    {
        double result = 1;
        for (int i=1; i < n+1; i++)
        {
            result = result * (x-2*i) / (x-2*i-1);
        }
        return result;
    }

    static void printResult(double result)
    {
        System.out.printf("Your result is %.03f%n", result);
    }
}
