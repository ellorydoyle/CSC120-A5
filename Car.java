/**
 * This is the Car class
 */
import java.util.ArrayList;
public class Car {

    ArrayList<Passenger> passengersAboard;
    int maxCapacity;

    /**
     * This is the car constructor
     * @param maxCapacity the max number of passengers aboard 
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersAboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * This gets the max capacity for the car
     * @return the max number of passengers aboard
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * This gets the number of seats remaining on the car 
     * @return the remaining number of seats in the car
     */
    public int seatsRemaining(){
        return (maxCapacity - passengersAboard.size());
    }

    /**
     * This adds a passenger
     * @param p the current instance of passenger 
     */
    public void addPassenger(Passenger p){
        getCapacity();
        if (passengersAboard.size() == maxCapacity){
            throw new RuntimeException("The car is at capacity.");
        }
        passengersAboard.add(p);
    }

    /**
     * This removes a passenger
     * @param p the current instance of passenger 
     */
    public void removePassenger(Passenger p){
        if (!passengersAboard.contains(p)){
            throw new RuntimeException("This passenger is not in the car.");
        }

        passengersAboard.remove(p);
    }

    /**
     * This prints the manifest of the car 
     */
    public void printManifest(){
        System.out.println("CAR MANIFEST\n");
        if (passengersAboard.isEmpty()){
            System.out.println("This car is EMPTY.");
        }
        else {passengersAboard.forEach(passenger ->{
            System.out.println(passenger);
        });
        }
    }

}