package pl.sda.calculator;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int subtract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiplication(int arg1, int arg2) {
        //throw new RuntimeException("Nie zaimplementowane");
        return arg1 * arg2;
    }

    public int divide(int arg1, int arg2) {
        //throw new RuntimeException("Nie zaimplementowane");
        if (arg2 == 0) {
            return 0;
        } else {
            return arg1 / arg2;
        }
    }

    public boolean even(int arg) {
        return (arg % 2) == 0;
    }

    public boolean odd(int arg) {
        return (arg % 2) != 0;
    }

    public double percent(double arg1, double arg2) {
        //throw new RuntimeException("Nie zaimplementowane");
        return (arg1 * arg2) / 100.0d;
    }
}
