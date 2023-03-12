public class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed, int year, float fuelConsumption, float fuelNeeded,float price, int doors){
            super(brand, speed, year, fuelConsumption, fuelNeeded,price);
            this.doors = doors;
        }

        public int getDoors () {
            return doors;

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

