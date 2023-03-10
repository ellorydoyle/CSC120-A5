/**
 * This is the Train class
 */
import java.util.ArrayList;
public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;
    int seatsRemaining;

    /**
     * This is the train constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     * @param currentFuelLevel
     * @param maxFuelLevel
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity, double currentFuelLevel, double maxFuelLevel) {
        this.engine = new Engine(fuelType, currentFuelLevel, maxFuelLevel);
        this.fuelCapacity = fuelCapacity;
        this.nCars = cars.size();
        this.passengerCapacity = passengerCapacity;
        this.cars = new ArrayList<Car>();
    }

    /**
     * This returns the train's engine
     * @return the train's engine 
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * This gets the ith car
     * @param i
     * @return the ith car
     */
    public Car getCar(int i){
        return cars.get(i);
    }
    
    /**
     * This gets the maximum capacity for all of the cars
     * @return number of passengers that can be on all of the cars
     */
    public int getMaxCapacity(){
        for (int i = 0; i < nCars; i++){
            getCar(i);
            passengerCapacity += cars.get(i).maxCapacity;
        }
        return passengerCapacity;
    }

    /**
     * This gets the remaining number of seats on the train
     * @return the remainingn number of seats on the train 
     */
    public int seatsRemaining(){
        getMaxCapacity();
        seatsRemaining = passengerCapacity;
        for (int i = 0; i < nCars; i++){
            seatsRemaining = seatsRemaining - cars.get(i).passengersAboard.size();
        }
        return seatsRemaining;
    }

    /**
     * This prints the manifest for the whole train 
     */
    public void printManifest(){
        System.out.println("TRAIN MANIFEST\n");
        for (int i=0; i < nCars; i++){
            cars.get(i).passengersAboard.forEach(passenger ->{
                System.out.println(passenger); 
            });
        }
    }
}
