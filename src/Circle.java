public class Circle extends Figure {
    double r;
    Point p;

    public Circle(Point po, double r1) {
       p=po;
       r=r1;
    }

    @Override
    public String toString(){
        return "(" + r + "; " + p + ")";
    }

    @Override
    public double square (){
        return 3.14*Math.pow(r,2);
    }

    @Override
    public double perimeter(){
        return 2*3.14*r;
    }


}
