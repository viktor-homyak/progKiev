package HomeWork1.Circle;

/**
 * Created by Viktor on 18.05.2015.
 */
public class TestCircle {
    public static void main(String[] Args){
        Circle Cir1 = new Circle();
        System.out.println("Наш круг " + Cir1.NAME + " имел изначальный радиус " + Cir1.getRadius()+" м. Меняем его на значение 45 м.");
        Cir1.setRadius(45);
        System.out.println("Проверка показала что радиус изменился и стал равен "
                + Cir1.getRadius()+" м. Площадь такого круга будет = " + Cir1.square()+ " м2");

    }

}
