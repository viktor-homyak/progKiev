package HomeWork1.Cars;
public class MyClass {
    public static void main(String[] args) {
        Car bmw = new Car("BMW",3);
        Car ferrari = new Car("Ferrari", 20000,4);
            
        bmw.turnOn();
        ferrari.turnOn();
            
        final int[] speeds = new int[] {20, 60, 100};
            
        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);
            
        bmw.turnOff();
        ferrari.turnOff();
            
        System.out.println(bmw.getName() + ": " + bmw.getMileage() + ". Fuel was spent: "+ bmw.getFuelOutGo());
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage() + ". Fuel was spent: "+ ferrari.getFuelOutGo());
    }
}
