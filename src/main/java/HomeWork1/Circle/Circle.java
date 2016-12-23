package HomeWork1.Circle;

/**
 * Created by Viktor on 17.05.2015.
 */
public class Circle {
    public static final String NAME = "Circle";
    private int radius;

    public Circle(){
        radius = 10;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return  radius;
    }
    public double square(){
        return  Math.PI*(radius^2);
    }
}

