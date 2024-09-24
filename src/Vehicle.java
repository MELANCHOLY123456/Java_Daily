class Vehicle {
    int passengers;
    int fuel_cap;
    int mpg;
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers = 7;
        minivan.fuel_cap = 16;
        minivan.mpg = 21;
        range = minivan.fuel_cap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
    }
}