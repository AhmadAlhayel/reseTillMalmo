public abstract class Vehicle {
    String brand;
    int speed;
    int year;
    float fuelConsumption;
    float fuelNeeded;
    float price;
    public Vehicle(String brand,int speed,int year,float fuelConsumption,float fuelNeeded,float price){
        this.brand=brand;
        this.speed=speed;
        this.year=year;
        this.fuelConsumption=fuelConsumption;
        this.fuelNeeded=fuelNeeded;
        this.price=price;

    }

    public String getBrand() {
        return brand;
    }
    public int getYear(){
        return year;
    }
    public abstract float getFuelConsumption();
    public abstract int getSpeed();
    public abstract float getFuelNeeded();
    public abstract float getPrice();

}
