/**
 * This is the Passenger class
 */
public class Passenger {
    
    String name;

    /**
     * This is the Passenger constructor
     * @param name 
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * This causes a passenger to board the car
     * @param c 
     */
    public void boardCar(Car c){
        try{
            c.addPassenger(this);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * This causes a passenger to get off the car
     * @param c
     */
    public void getOffCar(Car c){
        try{
            c.removePassenger(this);
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
