package ch02.figures;

public class RightTriangle implements FigureInterface {
    //Implement code here using instructions from Exercise 9 on page 148
    double sideA;
    double sideB;

    public RightTriangle(double legOne, double legTwo)
    {
    sideA = legOne;
    sideB = legTwo;
    }

    public double perimeter()
    // Returns perimeter of this figure.
    {
        double sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
        return(sideA + sideB + sideC);
    }

    public double area()
    // Returns area of this figure.
    {
        return((1/2) * sideA * sideB);
    }

}
