public class Engine {

    FuelType FuelType;
    double currentFuelLevel;
    double maxFuelLevel;

    public Engine(FuelType FuelType, double currentFuelLevel, double maxFuelLevel){
        this.FuelType = FuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public Engine(FuelType fuelType2, double fuelCapacity, int nCars, int passengerCapacity) {
    }

    public Engine(FuelType fuelType2, double fuelCapacity, int nCars, int passengerCapacity, int seatsRemaining) {
    }

    public void refuel(){
        if (currentFuelLevel == maxFuelLevel){
            throw new RuntimeException("The current fuel level is already at its maximum.");
        }
        currentFuelLevel = maxFuelLevel;
        System.out.println("The fuel level has been successfully returned to its maximum.");
    }

    public void go(){
        if (currentFuelLevel == 0){
            throw new RuntimeException("There is no fuel. Please refuel immediately.");
        }
        currentFuelLevel = (currentFuelLevel - 5.0);
    }
}