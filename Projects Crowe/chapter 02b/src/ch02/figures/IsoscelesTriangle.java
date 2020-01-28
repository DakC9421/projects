package ch02.figures;

public class IsoscelesTriangle implements FigureInterface {
    //Implement code here using instructions from Exercise 9 on page 148
    
    double baseI;
    double heightI;

    public IsoscelesTriangle(double baseI, double heightI)
    {
        this.baseI = baseI;
        this.heightI = heightI;
    }

    public double perimeter()
    // Returns perimeter of this figure.
    {
        double side = Math.sqrt(Math.pow(baseI * 0.5, 2) + Math.pow(height, 2));
        return (2 * side + baseI
    }

    public double area()
    // Returns area of this figure.
    {
        return((1 * baseI * heightI) / 2 );
    }
}
