public class Motorcycle extends Vehicle{
    boolean windShield;
    public Motorcycle(String brand, int speed, int year,float fuelConsumption, float fuelNeeded,float price,boolean windShield){
        super(brand, speed, year, fuelConsumption, fuelNeeded,price);
        this.windShield=true;}

    public void setWindShield(boolean windShield) {
        this.windShield = windShield;
    }
    public boolean getWindShield(){
        return true;
    }

    @Override
    public String getBrand () {
        return super.getBrand();
    }


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
