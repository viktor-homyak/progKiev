package HomeWork2.Figures;

/**
 * Created by Viktor on 25.05.2015.
 */
public class Circle extends AbstractFigure {
    private double radius;


    public Circle( double radius) {
        this.radius = radius;
        System.out.println("There was Created a circle with radius " + radius);
    }

    public Circle() {
        this(0);
    }






    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double square() {
        return Math.PI*(radius*radius);
    }
}
