class Vehicle {
    int passengers;
    int fuel_cap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuel_cap = f;
        mpg = m;
    }

    int range() {
        return fuel_cap * mpg;
    }

    double fuel_needed(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sport_scar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

//        int range_01, range_02;
//
//        range_01 = minivan.range();
//        range_02 = sport_scar.range();
//
//        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range_01 + " Miles");
//        System.out.println("Sport_scar can carry " + sport_scar.passengers + " with range of " + range_02 + " miles");

        gallons = minivan.fuel_needed(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sport_scar.fuel_needed(dist);
        System.out.println("To go " + dist + " miles sport_scar needs " + gallons + " gallons of fuel.");
    }
}
