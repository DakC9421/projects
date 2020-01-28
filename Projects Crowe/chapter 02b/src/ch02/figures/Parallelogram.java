package ch02.figures;

public class Parallelogram implements FigureInterface {
    //Implement code here using instructions from Exercise 9 on page 148
    double baseP;
    double heightP;
    double sideP;

    Parallelogram(double baseP, double heightP, double sideP)
    {
        this.baseP = baseP;
        this.heightP = heightP;
        this.sideP = sideP;
    }

    public double perimeter()
    // Returns perimeter of this figure.
    {
        double side = heightP / Math.sin(sideP);
        return (2 * (side + baseP));
    }

    public double area()
    // Returns area of this figure.
    {
        return(baseP * heightP);
    }
}
