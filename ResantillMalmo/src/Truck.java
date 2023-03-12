public class Truck extends Vehicle {

    int capacity;
    int doors;

    public Truck (String brand, int speed, int year, float fuelConsumption, float fuelNeeded, float price, int doors, int capacity) {
        super(brand, speed, year, fuelConsumption, fuelNeeded, price);
        this.doors = doors;
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }
    public int getDoors () {
        return doors;

    }

    @Override
    public String getBrand () {
        return super.getBrand();
    }

    @Override
    public int getYear () {
        return super.getYear();
    }

    @Override
    public int getSpeed () {
        return speed;
    }

    @Override
    public float getFuelConsumption () {
        return fuelConsumption;
    }
    @Override
    public float getFuelNeeded () {
        return (fuelConsumption * 2);
    }
    @Override
    public float getPrice(){
        return ((fuelConsumption*2)*19);
    }



}



