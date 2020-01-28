package ch02.figures;

public class Square implements FigureInterface  {
    //Implement code here using instructions from Exercise 9 on page 148
    double length;

    public Square(double newLength)
    {
       length = newLength;
    }

    public double perimeter()
    // Returns perimeter of this figure.
    {
        return(4 * length);
    }

    public double area()
    // Returns area of this figure.
    {
        return(length * length);
    }
}
