/**
 * This is the Engine class
 */
public class Engine {

    FuelType FuelType;
    double currentFuelLevel;
    double maxFuelLevel;

    /**
    * This is the constructor for the Engine class
    */
    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel){
        this.FuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }
    
    /**
     * This refuels the engine 
     */
    public void refuel(){
        if (currentFuelLevel == maxFuelLevel){
            throw new RuntimeException("The current fuel level is already at its maximum.");
        }
        currentFuelLevel = maxFuelLevel;
        System.out.println("The fuel level has been successfully returned to its maximum.");
    }

    /**
     * This causes the engine to start moving, decreases the current fuel level.
     */
    public void go(){
        if (currentFuelLevel == 0){
            throw new RuntimeException("There is no fuel. Please refuel immediately.");
        }
        currentFuelLevel = (currentFuelLevel - 5.0);
    }
}