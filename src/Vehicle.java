class Vehicle {
    int passengers;
    int fuel_cap;
    int mpg;
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sport_scar = new Vehicle();

        int range_01, range_02;

        minivan.passengers = 7;
        minivan.fuel_cap = 16;
        minivan.mpg = 21;

        sport_scar.passengers = 2;
        sport_scar.fuel_cap = 14;
        sport_scar.mpg = 12;

        range_01 = minivan.fuel_cap * minivan.mpg;
        range_02 = sport_scar.fuel_cap * sport_scar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range_01);
        System.out.println("Sport_scar can carry " + sport_scar.passengers + " with a range of " + range_02);
    }
}