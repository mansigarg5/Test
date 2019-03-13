//Q5: Implement Bridge Design Pattern for Color and Shape such that
// Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.

package DesignPatterns;

interface Color{
    String getColor();
}
class Pink implements Color{

    @Override
    public String getColor() {
        return "Pink";
    }
}
class Blue implements Color{

    @Override
    public String getColor() {
        return "Blue";
    }
}

abstract class Shape{
    String shape;
    Color color;
    public Shape(String shape, Color color){
        this.shape = shape;
        this.color = color;
    }
}

class SquareDemo extends Shape{
    public SquareDemo(String shape, Color color) {
        super(shape, color);
    }

    @Override
    public String toString() {
        return "Shape: "+shape+"\nColor: "+color.getColor();
    }
}
class TriangleDemo extends Shape{
    public TriangleDemo(String shape, Color color) {
        super(shape, color);
    }
    @Override
    public String toString() {
        return "Shape: "+shape+"\nColor: "+color.getColor();
    }
}
public class Q5 {
    public static void main(String[] args) {
        SquareDemo squareDemo = new SquareDemo("Square", new Pink());
        System.out.println(squareDemo.toString());
        TriangleDemo triangleDemo = new TriangleDemo("Triangle",new Blue());
        System.out.println(triangleDemo.toString());

    }
}
