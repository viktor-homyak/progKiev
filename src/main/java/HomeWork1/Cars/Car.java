package HomeWork1.Cars;
public class Car {
    private String name;
    private Engine engine; // мотор
    private Climate climate = new Climate(); // климат-контроль
    private double fuelOutGo=0;
    public Car(String name, double EngineCapacity) {
        this.name = name;
        engine = new Engine(0);
        engine.addEngineCapacity(EngineCapacity);
    }
    


    public Car(String name, double mileage,double EngineCapacity ) {
        this.name = name;
        engine = new Engine(mileage);
        engine.addEngineCapacity(EngineCapacity);
    }

    public String getName() {
        return name;
    }
    
    public double getMileage() {
        return engine.getMileage();
    }
    public double getFuelOutGo() {
        return fuelOutGo;
    }
    // завести мотор
    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }
    
    // заглушить мотор
    public void turnOff() {
        climate.turnOff();
    	engine.turnOff();
    }
    
    // установить скорость
    public void start(int speed, double hours) {
        if (engine.isStarted()) { // еще не заведен мотор
        	// пройденная дистанция
        	double distance = hours * speed;
        	engine.addMileage(distance);
            addFuelOutGo(distance);
        }
    }
    //пополнение потраченного топлива
    public  void addFuelOutGo(double distance) {
       double  engineCapacity = engine.getEngineCapacity();
        fuelOutGo += engineCapacity*distance;




    }
}