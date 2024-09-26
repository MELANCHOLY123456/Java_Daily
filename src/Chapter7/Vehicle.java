package Chapter7;

class Vehicle {
    private int passengers;
    private int fuel_cap;
    private int mpg;

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuel_cap() {
        return fuel_cap;
    }

    void setFuel_cap(int f) {
        fuel_cap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuel_cap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuel_cap;
    }

    double fuel_needed(int miles) {
        return (double) miles / mpg;
    }
}

class Truck extends Vehicle {
    private int car_go_cap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        car_go_cap = c;
    }

    int getCargo() {
        return car_go_cap;
    }

    void putCargo(int c) {
        car_go_cap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuel_needed(dist);

        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        gallons = pickup.fuel_needed(dist);

        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
    }
}
