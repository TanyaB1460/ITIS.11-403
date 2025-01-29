package lab18_Integral;

public abstract class CalculateIntegral {
    protected double a, b;
    protected Function function;


    public CalculateIntegral(double a, double b, Function function){
        this.a = a;
        this.b = b;
        this.function = function;
    }

    public abstract double get();

}