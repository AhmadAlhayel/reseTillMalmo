public class Main {
    public static void main(String[] args) {
        Car c1 = new Car ("BMW M5",220,2015,10,0,0,4);
        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Max speed: " + c1.getSpeed() + " km/h.");
        System.out.println("Doors: " + c1.getDoors());
        System.out.println("Fuel Consumption: " + c1.getFuelConsumption()+ "l/100 km.");
        System.out.println("Fuel Needed: " + c1.getFuelNeeded() + " l.");
        System.out.println("Model: (" + c1.getYear()+")");
        System.out.println("Price: " + c1.getPrice() + " Kr.");
        System.out.println(" ");


        Motorcycle m1 = new Motorcycle("Harley-Davidson",80,2019,5,0,0,true);
        System.out.println("Brand: " + m1.getBrand());
        System.out.println("Max speed: " + m1.getSpeed() + " km/h.");
        System.out.println("Doors: " + m1.getWindShield());
        System.out.println("Fuel Consumption: " + m1.getFuelConsumption() + " l/100 km.");
        System.out.println("Fuel Needed: " + m1.getFuelNeeded() + " l.");
        System.out.println("Model: (" + m1.getYear()+")");
        System.out.println("Price: " + m1.getPrice() + " Kr.");
        System.out.println(" ");

        Truck t1 = new Truck ("Ccania R450",90,2015,35,0,0,2,10);
        System.out.println("Brand: " + t1.getBrand());
        System.out.println("Max speed: " + t1.getSpeed() + " km/h.");
        System.out.println("Doors: " + t1.getDoors());
        System.out.println("Fuel Consumption: " + t1.getFuelConsumption() + " l/100 km.");
        System.out.println("Fuel Needed: " + t1.getFuelNeeded() + " l.");
        System.out.println("Model: (" + t1.getYear()+").");
        System.out.println("Price: " + t1.getPrice() + " Kr.");
        System.out.println("Capacity: " + t1.getCapacity() + " ton.");
        System.out.println(" ");

        float min=  c1.getPrice();
        String minVehicle = c1.getBrand();
        if (c1.getPrice()>m1.getPrice()){
            min= m1.getPrice();
            minVehicle = m1.getBrand();
        } else if (m1.getPrice()>t1.getPrice()) {
            min= t1.getPrice();
            minVehicle = t1.getBrand();
        }
        System.out.println(minVehicle + "är billigast, den kostar "+ min + " kronor per sträcka.");


    }
}