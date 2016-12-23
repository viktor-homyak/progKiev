package HomeWork2.Figures;



/**
 * Created by Viktor on 25.05.2015.
 */
public class FindingSqure {
    public static void main(String[] args){

        AbstractFigure [] arrayOfFigures = {new Rectangle(10,5), new Triangle(3,5,7), new Circle(9.6)};
        for (AbstractFigure c : arrayOfFigures) {
            System.out.println("\t Square of " + c.getName()+ " is: "+ c.square());
        }
            }
        }


