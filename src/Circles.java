public class Circles {
    private double radius;
    private final double PI = 3.14159;

    public void setRadius(double radiusGiven) {
        radius = radiusGiven;
    }
    public double getRadius(double r){
        return radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
    public double getDiameter(){
        return radius * 2;
    }
    public double getCircumference(){
        return 2 * radius * PI;
    }
    public Circles( double radiusGiven)
    {
        radius = radiusGiven;
    }
    public Circles(){
        radius = 0.0;
    }
}


/*public class Circle {
    private int x;
    private int y;
    private int r;
    Circle(int x,int y,int r){
        this.x =x;
        this.y = y;
        this.r = r;
    }
}*/
