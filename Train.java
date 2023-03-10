import java.util.ArrayList;
public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;
    int seatsRemaining;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, nCars, passengerCapacity);
        this.cars = new ArrayList<Car>();
    }

    public Engine getEngine(){
        return engine;
    }
    
    public Car getCar(int i){
        return cars.get(i);
    }
    
    public int getMaxCapacity(){
        for (int i = 0; i < nCars; i++){
            getCar(i);
            passengerCapacity += cars.get(i).maxCapacity;
        }
        return passengerCapacity;
    }

    public int seatsRemaining(){
        getMaxCapacity();
        seatsRemaining = passengerCapacity;
        for (int i = 0; i < nCars; i++){
            seatsRemaining = seatsRemaining - cars.get(i).passengersAboard.size();
        }
        return seatsRemaining;
    }

    public void printManifest(){
        System.out.println("TRAIN MANIFEST");
        for (int i=0; i < nCars; i++){
            cars.get(i).passengersAboard.forEach(passenger ->{
                System.out.println(passenger); 
            });
        }
    }
}
