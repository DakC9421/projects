package ch02.figures;

public class Main {

    public static void main(String[] args) {
	    //Testing code for the Circle class
        Circle myCircle = new Circle(5);
        System.out.println("The perimeter of myCircle is: " + myCircle.perimeter());
        System.out.println("The area of myCircle is: " + myCircle.area());

        //Testing code for the Rectangle class
        Rectangle myRectangle = new Rectangle(7, 9);
        System.out.println("The perimeter of myRectangle is: " + myRectangle.perimeter());
        System.out.println("The area of myRectangle is: " + myRectangle.area());

        //Testing code for the Square class
        Square mySquare = new Square(3);
        System.out.println("The perimeter of mySquare is: " + mySquare.perimeter());
        System.out.println("The area of mySquare is: " + mySquare.area());

        //Testing code for the RightTriangle class
        RightTriangle myRightTriangle = new RightTriangle(3, 9);
        System.out.println("The perimeter of myRightTriangle is: " + myRightTriangle.perimeter());
        System.out.println("The area of myRightTriangle is: " + myRightTriangle.area());

        //Testing code for the IsoscelesTriangle class
        IsoscelesTriangle myIsoscelesTriangle = new IsoscelesTriangle(3, 9);
        System.out.println("The perimeter of myIsoscelesTriangle is: " + myIsoscelesTriangle.perimeter());
        System.out.println("The area of myIsoscelesTriangle is: " + myIsoscelesTriangle.area());

        //Testing code for the Parallelogram class
        Parallelogram myParallelogram = new Parallelogram(7, 4, 0.7854);
        System.out.println("The perimeter of myParallelogram is: " + myParallelogram.perimeter());
        System.out.println("The area of myParallelogram is: " + myParallelogram.area());

    }
}
