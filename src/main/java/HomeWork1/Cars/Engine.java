package HomeWork1.Cars;
public class Engine {
    private double mileage;
    private boolean started;
    private double engineCapacity = 0;
    public Engine(double mileage) {
        this.mileage = mileage;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public double  getEngineCapacity() {
        return engineCapacity;

    }

    public void addEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
    }
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}
