package HomeWork2.Figures;

/**
 * Created by Viktor on 25.05.2015.
 */
 public class Rectangle extends AbstractFigure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("There was Created a rectangle with sides " + width+"; " + height+"; " );
    }

    public Rectangle() {
        this(0, 0);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double square() {
        return width*height;
    }
}
