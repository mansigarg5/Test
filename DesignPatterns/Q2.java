//Q2: Implement Factory Pattern to get the Polygon of differnt type.

package DesignPatterns;

interface Polygon{
    void getPolygon();
}
class Triangle implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Triangle.");

    }
}
class Square implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Square.");
    }
}
class Rectangle implements Polygon{
    @Override
    public void getPolygon() {
        System.out.println("This class will give a Rectangle.");
    }
}
class PreaprePolygon{
    Polygon polygon;
    public Polygon getPolygonShape(){
        return this.polygon;
    }
    public void setPolygonShape(Polygon polygon){
        this.polygon = polygon;
    }
}
class PolygonFactory{
    static PreaprePolygon getPolygonObject(String name){
        PreaprePolygon preaprePolygon = new PreaprePolygon();
        if(name.equals("Triangle")){
            preaprePolygon.setPolygonShape(new Triangle());
        }
        else if(name.equals("Square")){
            preaprePolygon.setPolygonShape(new Square());
        }
        else{
            preaprePolygon.setPolygonShape(new Rectangle());
        }
        return preaprePolygon;
    }
}

public class Q2 {
    public static void main(String[] args) {
        PreaprePolygon prepareTriangle = PolygonFactory.getPolygonObject("Triangle");
        prepareTriangle.getPolygonShape().getPolygon();
        PreaprePolygon prepareSquare = PolygonFactory.getPolygonObject("Square");
        prepareSquare.getPolygonShape().getPolygon();
        PreaprePolygon prepareRectangle = PolygonFactory.getPolygonObject("Rectangle");
        prepareRectangle.getPolygonShape().getPolygon();
    }
}
