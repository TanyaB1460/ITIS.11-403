package lab18_Integral;

public class Sinus implements Function{
    @Override
    public double calculate(double x) {
        return Math.sin(x);
    }
}