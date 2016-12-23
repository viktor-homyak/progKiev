package HomeWork2.Figures;

/**
 * Created by Виктор on 25.05.2015.
 */
public class Triangle extends AbstractFigure {

    private double side1,side2,side3;

    public Triangle(double side1,double side2,double side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("There was Created a triangle with sides " + side1+"; " + side2+"; " + side3+"; ");
    }

    public Triangle() {
        this(0, 0, 0);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double square() {
        
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
