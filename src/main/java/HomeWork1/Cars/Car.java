package HomeWork1.Cars;
public class Car {
    private String name;
    private Engine engine; // �����
    private Climate climate = new Climate(); // ������-��������
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
    // ������� �����
    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }
    
    // ��������� �����
    public void turnOff() {
        climate.turnOff();
    	engine.turnOff();
    }
    
    // ���������� ��������
    public void start(int speed, double hours) {
        if (engine.isStarted()) { // ��� �� ������� �����
        	// ���������� ���������
        	double distance = hours * speed;
        	engine.addMileage(distance);
            addFuelOutGo(distance);
        }
    }
    //���������� ������������ �������
    public  void addFuelOutGo(double distance) {
       double  engineCapacity = engine.getEngineCapacity();
        fuelOutGo += engineCapacity*distance;




    }
}