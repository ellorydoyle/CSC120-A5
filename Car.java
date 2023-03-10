import java.util.ArrayList;
public class Car {

    ArrayList<Passenger> passengersAboard;
    int maxCapacity;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersAboard = new ArrayList<Passenger>(maxCapacity);
    }

    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
        return (maxCapacity - passengersAboard.size());
    }

    public void addPassenger(Passenger p){
        getCapacity();
        if (passengersAboard.size() == maxCapacity){
            throw new RuntimeException("The car is at capacity.");
        }
        passengersAboard.add(p);
    }

    public void removePassenger(Passenger p){
        if (!passengersAboard.contains(p)){
            throw new RuntimeException("This passenger is not in the car.");
        }

        passengersAboard.remove(p);
    }

    public void printManifest(){
        System.out.println("CAR MANIFEST");
        if (passengersAboard.isEmpty()){
            System.out.println("This car is EMPTY.");
        }
        else {passengersAboard.forEach(passenger ->{
            System.out.println(passenger);
        });
        }
    }

}