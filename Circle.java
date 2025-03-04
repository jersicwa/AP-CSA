public class Circle {
    private double radius;
    public Circle(double r){
        radius=r;
    }
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double  getArea(){
        return Math.PI*radius*radius;
    }
}
